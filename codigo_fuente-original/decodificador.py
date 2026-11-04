import json
import struct
from PIL import Image

# --- CONFIGURACIÓN ---
RUTA_A = 'a'           # Archivo de registros
RUTA_MA = 'ma'         # Archivo de mapas comprimidos
RUTA_PD0 = 'pd0'       # Archivo de tablas de sprites
CARPETA_SPRITES = 'sprites/pi0/' # Carpeta con los 27 PNG extraídos
MAPA_A_RENDERIZAR = 7  # 7 = Gran Lago, 8 = El paso, 9 = El bosque, 10 = Carnicería, 11 = El terreno
ANCHO_TILE = 22        # Tamaño original de la casilla (ancho)
ALTO_TILE = 16         # Tamaño original de la casilla (alto)
INICIOS = [0, 2545, 6965, 10649, 15487, 22633, 27261, 31708, 35466, 39214, 42381]

# --- 1. FUNCIONES DE LECTURA ---
def extraer_registros(buffer_a):
    p = 0
    recs = []
    for _ in range(312):
        n = buffer_a[p] + (buffer_a[p + 1] << 8)
        p += 2
        recs.append(buffer_a[p : p + n])
        p += n
    return recs

def decodificar_mapa(buffer_ma, R, q):
    ancho = R[149][2 * q]
    alto = R[149][2 * q + 1]
    if q == 0: ancho, alto = 40, 32
    m = R[248][q]
    base = INICIOS[m]
    runs = R[197]
    p = 0; v7 = 10; v8 = 0; v1 = 0
    filas = []
    for _ in range(alto):
        fila = []
        for _ in range(ancho):
            if v7 >= runs[v8]:
                v1 = buffer_ma[base + p]
                p += 1
                if v1 >= 250:
                    v7 = 0; v8 = v1 - 250; v1 = runs[6 + v8] & 255
            v7 += 1
            fila.append(v1)
        filas.append(fila)
    return ancho, alto, filas

# --- 2. LECTURA DEL ARCHIVO PD0 (Tablas de Sprites) ---
def cargar_tablas_pd0(ruta):
    with open(ruta, 'rb') as f:
        d = f.read()
    p = 1
    B = []
    J = []
    longitudes = [119, 1291, 162, 162, 2782, 144, 1069, 6903, 823, 1721, 5492, 119, 1291, 1291, 1291, 162, 162, 162, 2782, 2782, 144, 1069, 1069, 6903, 6903, 6903, 823, 1721, 42, 5492, 5492, 1810, 1810, 1810, 1810, 1810]
    
    for i in range(11):
        n = longitudes[i]
        B.append([struct.unpack('>H', d[p+2*k:p+2*k+2])[0] for k in range(n)])
        p += 2 * n
    for i in range(25):
        n = longitudes[11+i]
        J.append([x - 256 if x > 127 else x for x in d[p:p+n]])
        p += n
    return B, J

# --- 3. FUNCIÓN DE DIBUJADO ---
def renderizar_mapa(q, B, J, mapas):
    ancho, alto, casillas = mapas[str(q)]['ancho'], mapas[str(q)]['alto'], mapas[str(q)]['casillas']
    
    # Crear lienzo transparente
    canvas = Image.new('RGBA', (ancho * ANCHO_TILE, alto * ALTO_TILE), (0, 0, 0, 0))
    
    # Cargar los 27 PNG de sprites
    sprites = []
    for i in range(27):
        try:
            img = Image.open(f'{CARPETA_SPRITES}{i:02d}.png').convert('RGBA')
            sprites.append(img)
        except FileNotFoundError:
            print(f"Falta el sprite {i:02d}.png")
            sprites.append(None)

    # Lógica interna para dibujar un sprite basado en su ID
    def dibujar_sprite(sid, x, y):
        if sid == 0 or sprites[0] is None: return
        img_idx = J[20][sid] & 31
        if img_idx >= 27 or sprites[img_idx] is None: return
        
        sx = J[21][sid] & 127
        sy = J[22][sid] & 255
        w = J[23][sid] & 255
        h = J[24][sid] & 255
        if w == 0 or h == 0: return
        
        src = sprites[img_idx]
        if sx + w > src.width or sy + h > src.height:
            w = min(w, src.width - sx)
            h = min(h, src.height - sy)
            if w <= 0 or h <= 0: return
            
        recorte = src.crop((sx, sy, sx + w, sy + h))
        if x + 11 >= 0 and y + 8 >= 0: 
            canvas.alpha_composite(recorte, (x + 11, y + 8))

    # Lógica para dibujar un Tile (casilla)
    def dibujar_tile(t_id, x, y, depth=0):
        if depth > 4 or t_id >= len(B[9]): return
        v = B[9][t_id]
        inicio = v & 8191
        under = (v >> 14) & 3
        
        # Si el tile tiene una capa inferior y no es un objeto dinámico (árbol/roca)
        if under and not (180 <= t_id <= 231): 
            dibujar_sprite((under - 1) * 3 + 1, x, y)
            
        cnt = J[16][t_id] & 63
        for k in range(inicio, inicio + cnt):
            e = B[10][k]
            sid = e & 8191
            xo = ((e & 0xC000) >> 14) << 7
            
            if ((e & 8192) >> 13) == 0:
                dibujar_sprite(sid, x + J[18][k] + xo, y + J[19][k])
            else:
                dibujar_tile(sid, x + J[18][k] + xo, y + J[19][k], depth + 1)

    # Iterar sobre la matriz y dibujar cada casilla
    print(f"Renderizando {ancho}x{alto} casillas...")
    
    # Y-Sorting: Dibujamos de arriba a abajo para que las copas de los árboles 
    # se dibujen DESPUÉS de la base y se superpongan correctamente.
    for y in range(alto):
        # El eje X en reversa ayuda a que los objetos con volumen se dibujen mejor
        for x in range(ancho - 1, -1, -1):
            t_id = casillas[y][x]
            
            # Variación de pasto (Ruido matemático simple en lugar de rayas)
            if t_id <= 8:
                t_id += (x * 3 + y * 7) % 3 
                
            dibujar_tile(t_id, x * ANCHO_TILE, y * ALTO_TILE)

    return canvas

# --- 4. EJECUCIÓN PRINCIPAL ---
def main():
    print("Cargando archivos...")
    try:
        with open(RUTA_A, 'rb') as f: buffer_a = f.read()
        with open(RUTA_MA, 'rb') as f: buffer_ma = f.read()
    except FileNotFoundError as e:
        print(f"Error: No se encontró {e.filename}. Asegúrate de estar en la carpeta correcta.")
        return
    
    R = extraer_registros(buffer_a)
    mapas_extraidos = {}
    for q in range(12):
        w, h, c = decodificar_mapa(buffer_ma, R, q)
        mapas_extraidos[str(q)] = {"ancho": w, "alto": h, "casillas": c}
        
    print("Cargando tablas de sprites (pd0)...")
    B, J = cargar_tablas_pd0(RUTA_PD0)
    
    print(f"Generando imagen del mapa {MAPA_A_RENDERIZAR}...")
    imagen_final = renderizar_mapa(MAPA_A_RENDERIZAR, B, J, mapas_extraidos)
    
    nombre_salida = f"mapa_{MAPA_A_RENDERIZAR}.png"
    imagen_final.save(nombre_salida)
    print(f"¡Listo! Guardado como {nombre_salida}")

if __name__ == '__main__':
    main()
#!/usr/bin/env python3
"""Decodifica los mapas de Prehistoric Tribes (J2ME) desde los archivos 'ma' y 'a' del .jar.

Uso: python3 decodificar_mapas.py carpeta_del_jar_descomprimido salida.json

Formato (verificado: cada bloque se consume exacto, byte a byte):
 - 'a': 312 registros [longitud u16 little-endian][datos]. Registros usados:
     149 = (ancho, alto) por id de misión q;  197 = tabla de runs;  248 = q -> índice de mapa en 'ma'.
 - 'ma': 10 mapas concatenados; inicios [0,2545,6965,10649,15487,22633,27261,31708,35466,39214,42381].
 - Cada mapa es una rejilla ancho×alto en orden de filas. Un byte <250 es una casilla literal.
   Un byte 250+k (k=0..5) es un run: repite la casilla R197[6+k] un total de R197[k] veces.
 - Las casillas 0..8 son variantes de suelo (el juego suma un azar 0..2 al cargar).
 - Misiones 7 a 11 = mapas de la partida personalizada.
"""
import sys, json, os
INICIOS=[0,2545,6965,10649,15487,22633,27261,31708,35466,39214,42381]
def registros(a):
    p=0; recs=[]
    for _ in range(312):
        n=a[p]+(a[p+1]<<8); p+=2; recs.append(a[p:p+n]); p+=n
    return recs
def decodificar(ma,R,q):
    ancho,alto=R[149][2*q],R[149][2*q+1]
    if q==0: ancho,alto=40,32
    m=R[248][q]; base=INICIOS[m]
    runs=R[197]; p=0; v7=10; v8=0; v1=0; filas=[]
    for _ in range(alto):
        fila=[]
        for _ in range(ancho):
            if v7>=runs[v8]:
                v1=ma[base+p]; p+=1
                if v1>=250:
                    v7=0; v8=v1-250; v1=runs[6+v8]&255
            v7+=1; fila.append(v1)
        filas.append(fila)
    return ancho,alto,filas
if __name__=='__main__':
    d=sys.argv[1]; a=open(os.path.join(d,'a'),'rb').read(); ma=open(os.path.join(d,'ma'),'rb').read()
    R=registros(a); out={}
    for q in range(12):
        w,h,g=decodificar(ma,R,q); out[q]={'ancho':w,'alto':h,'casillas':g}
    json.dump(out,open(sys.argv[2],'w'))
    print('mapas decodificados:',len(out))

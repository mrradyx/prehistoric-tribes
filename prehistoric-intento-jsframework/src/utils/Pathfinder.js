export default class Pathfinder {
    static findPath(gridMatrix, startX, startY, targetX, targetY) {
        const openList = [];
        const closedList = new Set();
        const rows = gridMatrix.length;
        const cols = gridMatrix[0].length;

        // Nodo inicial
        openList.push({ x: startX, y: startY, g: 0, h: 0, f: 0, parent: null });

        while (openList.length > 0) {
            // Extraer el nodo con el menor costo total (f)
            openList.sort((a, b) => a.f - b.f);
            const current = openList.shift();

            // Usar un string como clave para la lista cerrada es más rápido en JS
            const posKey = `${current.x},${current.y}`;
            if (closedList.has(posKey)) continue;
            closedList.add(posKey);

            // Si llegamos al destino, reconstruir el camino hacia atrás
            if (current.x === targetX && current.y === targetY) {
                const path = [];
                let curr = current;
                while (curr) {
                    path.push({ x: curr.x, y: curr.y });
                    curr = curr.parent;
                }
                return path.reverse(); // Invertir para que vaya desde el inicio hasta el objetivo
            }

            // Evaluar los 4 vecinos ortogonales (Arriba, Abajo, Izquierda, Derecha)
            const neighbors = [
                { x: current.x, y: current.y - 1 },
                { x: current.x, y: current.y + 1 },
                { x: current.x - 1, y: current.y },
                { x: current.x + 1, y: current.y }
            ];

            for (let n of neighbors) {
                // 1. Validar que no se salga de los límites del mapa
                if (n.x < 0 || n.x >= cols || n.y < 0 || n.y >= rows) continue;
                
                // 2. Validar colisiones en la matriz (0 = libre, >0 = ocupado)
                if (gridMatrix[n.y][n.x] !== 0) continue; 
                
                // 3. Omitir si ya fue evaluado y cerrado
                if (closedList.has(`${n.x},${n.y}`)) continue;

                // Calcular costos (Usando Distancia Manhattan)
                const g = current.g + 1; // Costo acumulado desde el inicio
                const h = Math.abs(n.x - targetX) + Math.abs(n.y - targetY); // Heurística hasta el final
                const f = g + h; // Costo total

                openList.push({ x: n.x, y: n.y, g, h, f, parent: current });
            }
        }
        
        // Si el bucle termina y no encontró al target, el área es inaccesible
        return []; 
    }
}
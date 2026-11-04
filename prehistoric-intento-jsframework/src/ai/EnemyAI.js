export default class EnemyAI {
    // ...

    think() {
        // 1. Fase de reclutamiento (Prioridad Alta si hay mucha comida)
        if (this.resources.food >= 60 && this.villagers.getChildren().length < 10) {
            // Encuentra la base/cabaña enemiga y genera una unidad
            this.scene.spawnVillager(this.baseX, this.baseY, true);
        }

        // 2. Fase de asignación de tareas...
        const idleVillagers = this.villagers.getChildren().filter(v => v.currentState === 'idle');
        idleVillagers.forEach(villager => {
            // Si hay suficientes recursos, buscar un edificio del jugador para atacar
            if (this.resources.wood >= 100 && this.resources.stone >= 50) {
                const targetBuilding = this.scene.buildings.getFirstAlive();
                if (targetBuilding) {
                    const targetGridX = Math.floor(targetBuilding.x / this.scene.tileSize);
                    const targetGridY = Math.floor(targetBuilding.y / this.scene.tileSize);
                    
                    villager.assignTask({ type: 'MOVE', x: targetGridX, y: targetGridY - 1 });
                    
                    // Al llegar, el aldeano necesitará una instrucción directa de startAttacking(targetBuilding)
                    // que puedes desencadenar al finalizar el movimiento en moveNextNode()
                }
            } else {
                // Seguir recolectando...
            }
        });
    }
}
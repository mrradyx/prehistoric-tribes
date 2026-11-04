import Villager from '../entities/Villager.js';
import EnemyAI from '../ai/EnemyAI.js';

export default class GameScene extends Phaser.Scene {
    constructor() {
        super('GameScene');
    }

    create() {
        // 1. Inicializar Economía Global
        this.registry.set('wood', 150);
        this.registry.set('food', 100);
        this.registry.set('stone', 50);

        // 2. Cargar Datos y UI
        this.scene.launch('UIScene');
        const mapData = this.cache.json.get('mapData');
        this.buildingData = this.cache.json.get('buildingData');
        this.mapLayout = mapData.layout;
        
        // 3. Grupos de Entidades
        this.villagers = this.add.group();
        this.buildings = this.add.group();
        this.selectedBuildingId = null;
        this.selectedVillager = null;

        // 4. Configurar Entorno
        this.createGrid(mapData);
        this.setupCamera();
        
        // Instanciar la IA Enemiga en la esquina inferior derecha (ej: x:18, y:13)
        this.enemyTribe = new EnemyAI(this, 18, 13);

        // 5. Controles de Entrada
        this.input.mouse.disableContextMenu();
        this.setupInputHandlers();

        // 6. Teclas de Guardado/Carga
        this.input.keyboard.on('keydown-S', () => this.saveGame());
        this.input.keyboard.on('keydown-L', () => this.loadGame());
    }

    update(time, delta) {
        // Ejecutar los ciclos vitales de todas las unidades en pantalla
        this.villagers.getChildren().forEach(villager => {
            if (villager.active) villager.updateNeeds(delta);
        });
    }

createGrid(mapData) {
        this.tileSize = mapData.tileSize || 32;
        this.cols = mapData.width || 20;
        this.rows = mapData.height || 15;
        
        this.gridMatrix = Array(this.rows).fill().map(() => Array(this.cols).fill(0));

        if (this.mapLayout) {
            for (let y = 0; y < this.rows; y++) {
                for (let x = 0; x < this.cols; x++) {
                    const tileId = this.mapLayout[y][x];
                    
                    // Asignar colores según el ID del JSON
                    let color = 0x228B22; // 0 = Hierba (Verde oscuro)
                    if (tileId === 2) color = 0x8B4513; // 2 = Bosque/Madera (Café)
                    if (tileId === 3) color = 0x696969; // 3 = Cantera (Gris oscuro)
                    
                    // Dibujar el cuadro de terreno
                    this.add.rectangle(x * this.tileSize, y * this.tileSize, this.tileSize, this.tileSize, color).setOrigin(0, 0);

                    // Bloquear si es un obstáculo
                    if (tileId > 0) this.gridMatrix[y][x] = 1; 
                }
            }
        }

        // Cuadrícula visual superpuesta
        this.add.grid(
            (this.cols * this.tileSize) / 2, (this.rows * this.tileSize) / 2,
            this.cols * this.tileSize, this.rows * this.tileSize,
            this.tileSize, this.tileSize,
            0x000000, 0, 0xffffff, 0.15
        );
    }

    setupCamera() {
        const cam = this.cameras.main;
        cam.setBounds(0, 0, this.cols * this.tileSize, this.rows * this.tileSize);

        this.input.on('wheel', (pointer, gameObjects, deltaX, deltaY) => {
            let newZoom = Phaser.Math.Clamp(cam.zoom - (deltaY * 0.001), 0.5, 2.0);
            cam.setZoom(newZoom);
        });

        this.input.on('pointermove', (pointer) => {
            if (!pointer.isDown) return;
            cam.scrollX -= (pointer.x - pointer.prevPosition.x) / cam.zoom;
            cam.scrollY -= (pointer.y - pointer.prevPosition.y) / cam.zoom;
        });
    }

    setupInputHandlers() {
        this.input.on('pointerdown', (pointer, gameObjects) => {
            if (pointer.y > this.scale.height - 100) return; // Ignorar clic en UI

            const gridX = Math.floor(pointer.worldX / this.tileSize);
            const gridY = Math.floor(pointer.worldY / this.tileSize);

            if (pointer.rightButtonDown()) {
                this.handleRightClick(gridX, gridY, pointer);
            } else {
                this.handleLeftClick(gridX, gridY, gameObjects);
            }
        });
    }

    handleLeftClick(gridX, gridY, gameObjects) {
        if (this.selectedBuildingId) {
            this.placeBuilding(gridX, gridY, this.selectedBuildingId);
            return;
        }

        const clickedEntity = gameObjects[0];
        
        // Spawnear aldeano si se hace clic en una cabaña propia
        if (clickedEntity && this.buildings.contains(clickedEntity) && clickedEntity.type === 'cabana') {
            this.spawnVillager(gridX, gridY, false);
            return;
        }

        // Seleccionar aldeano
        if (clickedEntity && clickedEntity.constructor.name === 'Villager' && !clickedEntity.isEnemy) {
            if (this.selectedVillager) this.selectedVillager.clearTint();
            this.selectedVillager = clickedEntity;
            this.selectedVillager.setTint(0x00ff00);
        } else {
            if (this.selectedVillager) {
                this.selectedVillager.clearTint();
                this.selectedVillager = null;
            }
        }
    }

    handleRightClick(gridX, gridY, pointer) {
        if (!this.selectedVillager) return;
        if (gridX < 0 || gridX >= this.cols || gridY < 0 || gridY >= this.rows) return;

        this.selectedVillager.taskQueue = []; // Cancelar acción actual
        const tileId = this.mapLayout[gridY][gridX];

        if (tileId === 2) { // 2 = Bosque
            this.selectedVillager.assignTask({ type: 'GATHER', x: gridX, y: gridY, resource: 'wood' });
            this.drawClickFeedback(pointer.worldX, pointer.worldY, 0x00ff00);
        } else if (tileId === 3) { // 3 = Cantera
            this.selectedVillager.assignTask({ type: 'GATHER', x: gridX, y: gridY, resource: 'stone' });
            this.drawClickFeedback(pointer.worldX, pointer.worldY, 0x00ff00);
        } else if (this.gridMatrix[gridY][gridX] === 0) {
            this.selectedVillager.assignTask({ type: 'MOVE', x: gridX, y: gridY });
            this.drawClickFeedback(pointer.worldX, pointer.worldY, 0xffffff);
        } else {
            this.drawClickFeedback(pointer.worldX, pointer.worldY, 0xff0000); // Inválido
        }
    }

    drawClickFeedback(x, y, color) {
        const circle = this.add.circle(x, y, 5, color, 0.8);
        this.tweens.add({ targets: circle, scale: 2, alpha: 0, duration: 300, onComplete: () => circle.destroy() });
    }

    canPlaceBuilding(gridX, gridY, w, h) {
        if (gridX < 0 || gridY < 0 || gridX + w > this.cols || gridY + h > this.rows) return false;
        for (let y = gridY; y < gridY + h; y++) {
            for (let x = gridX; x < gridX + w; x++) {
                if (this.gridMatrix[y][x] !== 0) return false;
            }
        }
        return true;
    }

    placeBuilding(gridX, gridY, buildingId, ignoreCost = false) {
        const bData = this.buildingData[buildingId];
        const w = bData.width || 1, h = bData.height || 1;
        const cWood = bData.costWood || 0, cStone = bData.costStone || 0;

        const currentWood = this.registry.get('wood');
        const currentStone = this.registry.get('stone');

        if (!ignoreCost && (currentWood < cWood || currentStone < cStone)) return false;

        if (this.canPlaceBuilding(gridX, gridY, w, h)) {
            if (!ignoreCost) {
                this.registry.set('wood', currentWood - cWood);
                this.registry.set('stone', currentStone - cStone);
            }

            for (let y = gridY; y < gridY + h; y++) {
                for (let x = gridX; x < gridX + w; x++) this.gridMatrix[y][x] = 1;
            }

            const buildingSprite = this.add.image(gridX * this.tileSize, gridY * this.tileSize, bData.texture).setOrigin(0, 0);
            buildingSprite.setInteractive();
            buildingSprite.health = bData.health;
            buildingSprite.type = buildingId;
            this.buildings.add(buildingSprite);
            
            return true;
        }
        return false;
    }

    spawnVillager(gridX, gridY, isEnemy = false) {
        const foodCost = 30;
        let spawnPixelX = gridX * this.tileSize;
        let spawnPixelY = (gridY + 1) * this.tileSize;

        if (isEnemy) {
            if (this.enemyTribe.resources.food >= foodCost) {
                this.enemyTribe.resources.food -= foodCost;
                this.enemyTribe.spawnEnemyVillager(gridX, gridY + 1);
            }
        } else {
            const currentFood = this.registry.get('food');
            if (currentFood >= foodCost) {
                this.registry.set('food', currentFood - foodCost);
                const villager = new Villager(this, spawnPixelX, spawnPixelY, 'villager');
                villager.setInteractive();
                this.villagers.add(villager);
            } else {
                this.cameras.main.shake(100, 0.005);
            }
        }
    }

    setSelectedBuilding(buildingId) {
        this.selectedBuildingId = buildingId;
    }

    saveGame() {
        const state = {
            economy: { wood: this.registry.get('wood'), food: this.registry.get('food'), stone: this.registry.get('stone') },
            buildings: this.buildings.getChildren().map(b => ({ id: b.type, x: b.x, y: b.y, health: b.health })),
            villagers: this.villagers.getChildren().map(v => ({ x: v.x, y: v.y, health: v.health, isEnemy: v.isEnemy || false })),
            enemyEconomy: this.enemyTribe.resources
        };
        localStorage.setItem('prehistoric_save_slot1', JSON.stringify(state));
        console.log("Partida Guardada");
    }

    loadGame() {
        const savedData = localStorage.getItem('prehistoric_save_slot1');
        if (!savedData) return;

        const state = JSON.parse(savedData);
        this.registry.set('wood', state.economy.wood);
        this.registry.set('food', state.economy.food);
        this.registry.set('stone', state.economy.stone);
        this.enemyTribe.resources = state.enemyEconomy;

        this.buildings.clear(true, true);
        this.villagers.clear(true, true);
        
        // Reiniciar gridMatrix usando solo obstáculos naturales del mapa
        this.gridMatrix = Array(this.rows).fill().map(() => Array(this.cols).fill(0));
        for (let y = 0; y < this.rows; y++) {
            for (let x = 0; x < this.cols; x++) {
                if (this.mapLayout[y][x] > 0) this.gridMatrix[y][x] = 1;
            }
        }

        state.buildings.forEach(bData => {
            this.placeBuilding(Math.floor(bData.x / this.tileSize), Math.floor(bData.y / this.tileSize), bData.id, true);
            const b = this.buildings.getLast(true);
            b.health = bData.health;
        });

        state.villagers.forEach(vData => {
            const v = new Villager(this, vData.x, vData.y, 'villager');
            v.health = vData.health;
            v.isEnemy = vData.isEnemy;
            v.setInteractive();
            if (v.isEnemy) {
                v.setTint(0xff4444);
                this.enemyTribe.villagers.add(v);
            }
            this.villagers.add(v);
            if (v.hpBar) v.hpBar.setHealth(v.health);
        });
        console.log("Partida Cargada");
    }
}
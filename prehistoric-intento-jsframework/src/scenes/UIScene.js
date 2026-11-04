export default class UIScene extends Phaser.Scene {
    constructor() {
        super({ key: 'UIScene' });
    }

    create() {
        this.gameScene = this.scene.get('GameScene');
        this.buildingData = this.cache.json.get('buildingData');
        const { width, height } = this.scale;
        
        // 1. Panel inferior de construcción (Fondo oscuro estático)
        const panelHeight = 100;
        const panelY = height - panelHeight;
        this.add.rectangle(0, panelY, width, panelHeight, 0x222222).setOrigin(0, 0);

        // 2. Indicadores de economía global (vinculados al registry)
        this.woodText = this.add.text(10, 10, `Madera: ${this.registry.get('wood')}`, { fontSize: '16px', color: '#fff' });
        this.foodText = this.add.text(120, 10, `Comida: ${this.registry.get('food')}`, { fontSize: '16px', color: '#fff' });
        this.stoneText = this.add.text(230, 10, `Piedra: ${this.registry.get('stone')}`, { fontSize: '16px', color: '#fff' });

        // Escuchar eventos globales de cambio de recursos
        this.registry.events.on('changedata-wood', (parent, value) => {
            this.woodText.setText(`Madera: ${value}`);
            this.updateMenuAffordability();
        });
        
        this.registry.events.on('changedata-food', (parent, value) => {
            this.foodText.setText(`Comida: ${value}`);
        });

        this.registry.events.on('changedata-stone', (parent, value) => {
            this.stoneText.setText(`Piedra: ${value}`);
            this.updateMenuAffordability();
        });

        // 3. Generar el menú inferior iterando sobre edificios.json
        this.menuIcons = [];
        this.createBuildingMenu(panelY);
        
        // 4. Cursor visual (cuadro verde) para indicar qué edificio está seleccionado
        this.selectionHighlight = this.add.rectangle(0, 0, 40, 40, 0x00ff00, 0).setStrokeStyle(2, 0x00ff00);
        this.selectionHighlight.setVisible(false);
    }

    createBuildingMenu(panelY) {
        let startX = 50;
        const spacing = 70;
        let index = 0;

        for (const [buildingId, bData] of Object.entries(this.buildingData)) {
            const iconX = startX + (index * spacing);
            const iconY = panelY + 50; // Centrado en el panel

            // Textura por defecto si no se encuentra en el JSON
            const texture = bData.texture || 'default_icon';
            const icon = this.add.image(iconX, iconY, texture);
            
            icon.setInteractive({ useHandCursor: true });
            
            icon.on('pointerdown', () => {
                this.selectBuilding(buildingId, icon.x, icon.y);
            });

            // Mostrar el costo debajo del icono (Ej: "50W 20P")
            const costWood = bData.costWood || 0;
            const costStone = bData.costStone || 0;
            this.add.text(iconX, iconY + 25, `${costWood}W ${costStone}P`, { fontSize: '10px', color: '#fff' }).setOrigin(0.5);
            
            // Guardar referencia para evaluar si el jugador puede pagarlo luego
            this.menuIcons.push({ icon, costWood, costStone });
            index++;
        }
    }

    selectBuilding(buildingId, iconX, iconY) {
        this.selectionHighlight.setPosition(iconX, iconY).setVisible(true);
        this.gameScene.setSelectedBuilding(buildingId); // Enviar estado a GameScene
    }

    updateMenuAffordability() {
        const currentWood = this.registry.get('wood');
        const currentStone = this.registry.get('stone');
        
        // Oscurecer los iconos que el jugador ya no puede pagar
        this.menuIcons.forEach(item => {
            if (currentWood >= item.costWood && currentStone >= item.costStone) {
                item.icon.setTint(0xffffff); // Color normal
            } else {
                item.icon.setTint(0x555555); // Oscurecido/Deshabilitado visualmente
            }
        });
    }
}
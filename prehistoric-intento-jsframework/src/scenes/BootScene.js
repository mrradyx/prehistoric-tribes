export default class BootScene extends Phaser.Scene {
    constructor() {
        super('BootScene');
    }

    preload() {
        // Solo cargamos los datos JSON puros
        this.load.json('mapData', 'assets/data/mapas.json');
        this.load.json('buildingData', 'assets/data/edificios.json');
    }

    create() {
        // Herramienta nativa para dibujar gráficos en memoria
        const g = this.make.graphics({ x: 0, y: 0, add: false });
        
        // 1. Crear textura del Aldeano (Cuadrado Azul)
        g.fillStyle(0x0088ff);
        g.fillRect(0, 0, 32, 32);
        g.generateTexture('villager', 32, 32);
        g.clear();

        // 2. Crear textura de la Cabaña (Cuadrado Naranja)
        g.fillStyle(0xff8800);
        g.fillRect(0, 0, 32, 32); // 1x1
        g.generateTexture('cabana', 32, 32);
        g.clear();

        // 3. Crear textura de la Armería (Cuadrado Gris)
        g.fillStyle(0x888888);
        g.fillRect(0, 0, 64, 64); // 2x2
        g.generateTexture('armeria', 64, 64);
        g.clear();

        // 4. Crear textura de la Torre (Cuadrado Morado)
        g.fillStyle(0x8800ff);
        g.fillRect(0, 0, 32, 32); // 1x1
        g.generateTexture('torre', 32, 32);
        g.clear();

        // Textura por defecto para errores
        g.fillStyle(0xff00ff);
        g.fillRect(0, 0, 32, 32);
        g.generateTexture('default_icon', 32, 32);

        // Arrancar el juego
        this.scene.start('GameScene');
    }
}
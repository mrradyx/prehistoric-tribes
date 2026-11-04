// Importación de las tres escenas principales
import BootScene from './scenes/BootScene.js';
import GameScene from './scenes/GameScene.js';
import UIScene from './scenes/UIScene.js';

// Configuración general del motor de Phaser
const config = {
    // AUTO decide si usar WebGL (mejor rendimiento) o Canvas API como plan de respaldo
    type: Phaser.AUTO, 
    
    // Resolución interna del juego
    width: 800,
    height: 600,
    
    // ID del div en index.html donde se renderizará el juego
    parent: 'game-container',
    
    // ¡CRÍTICO PARA JUEGOS RETRO/J2ME! Evita que el navegador difumine los sprites al hacer zoom
    pixelArt: true, 
    
    // Configuración de escalado para monitores modernos
    scale: {
        mode: Phaser.Scale.FIT, // Ajusta el canvas manteniendo la proporción 800x600
        autoCenter: Phaser.Scale.CENTER_BOTH // Centra el juego en la pantalla vertical y horizontalmente
    },

    // Arreglo de escenas. Phaser arranca automáticamente la primera de la lista (BootScene)
    scene: [
        BootScene, 
        GameScene, 
        UIScene
    ]
};

// Instanciación del juego. Esto dispara el ciclo de vida del motor.
const game = new Phaser.Game(config);
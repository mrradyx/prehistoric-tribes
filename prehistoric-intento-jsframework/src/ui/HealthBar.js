export default class HealthBar {
    constructor(scene, x, y, width, height, maxHealth) {
        this.bar = new Phaser.GameObjects.Graphics(scene);
        
        // Centrar la barra y elevarla sobre el sprite del aldeano/edificio
        this.offsetX = -width / 2;
        this.offsetY = -20; 
        
        this.width = width;
        this.height = height;
        this.value = maxHealth;
        this.max = maxHealth;
        
        scene.add.existing(this.bar);
        this.setPosition(x, y);
    }

    setHealth(amount) {
        this.value = Phaser.Math.Clamp(amount, 0, this.max);
        this.draw();
    }

    setPosition(x, y) {
        this.x = x + this.offsetX;
        this.y = y + this.offsetY;
        this.draw();
    }

    draw() {
        this.bar.clear();
        
        // Borde exterior
        this.bar.fillStyle(0x000000);
        this.bar.fillRect(this.x, this.y, this.width, this.height);
        
        if (this.value === 0) return;
        
        const percentage = this.value / this.max;
        
        let color = 0x00ff00; 
        if (percentage < 0.3) color = 0xff0000; 
        else if (percentage < 0.6) color = 0xffff00; 
        
        // Relleno interior proporcional a la vida restante
        this.bar.fillStyle(color);
        this.bar.fillRect(this.x + 1, this.y + 1, (this.width - 2) * percentage, this.height - 2);
    }

    destroy() {
        this.bar.destroy();
    }
}
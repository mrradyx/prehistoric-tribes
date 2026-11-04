import Pathfinder from '../utils/Pathfinder.js';
import HealthBar from '../ui/HealthBar.js';

export default class Villager extends Phaser.GameObjects.Sprite {
    constructor(scene, x, y, texture) {
        super(scene, x, y, texture);
        scene.add.existing(this);

        // 1. Atributos vitales
        this.health = 100;
        this.hunger = 100; 
        this.rest = 100;   
        this.hungerRate = 2.0; 
        this.restRate = 1.5;

        // 2. Máquina de estados y tareas
        this.currentState = 'idle'; // 'idle', 'moving', 'working', 'sleeping', 'attacking'
        this.taskQueue = [];
        this.currentTask = null;
        this.currentPath = [];
        this.workTimer = null;
        this.attackTimer = null;
        this.targetEntity = null;
        this.isEnemy = false;

        // 3. UI acoplada
        this.hpBar = new HealthBar(scene, x, y, 24, 4, this.health);
    }

    updateNeeds(delta) {
        const deltaSeconds = delta / 1000;

        // Hambre
        if (this.hunger > 0) {
            this.hunger -= this.hungerRate * deltaSeconds;
            if (this.hunger < 0) this.hunger = 0;
        } else {
            this.health -= 5 * deltaSeconds; 
            this.hpBar.setHealth(this.health);
        }

        // Descanso
        if (this.currentState !== 'sleeping') {
            if (this.rest > 0) {
                this.rest -= this.restRate * deltaSeconds;
                if (this.rest < 0) this.rest = 0;
            } else {
                this.sleep();
            }
        } else {
            this.rest += 15 * deltaSeconds;
            if (this.rest >= 100) {
                this.rest = 100;
                this.currentState = 'idle';
                this.processNextTask();
            }
        }

        this.checkVitality();
    }

    checkVitality() {
        if (this.health <= 0) {
            this.health = 0;
            this.stopWorking();
            if (this.hpBar) this.hpBar.destroy();
            this.destroy(); 
        }
    }

    sleep() {
        this.stopWorking();
        this.taskQueue = [];
        this.currentState = 'sleeping';
    }

    // --- SISTEMA DE TAREAS Y MOVIMIENTO ---

    assignTask(task) {
        this.taskQueue.push(task);
        if (this.currentState === 'idle') {
            this.processNextTask();
        }
    }

    processNextTask() {
        if (this.taskQueue.length === 0) {
            this.currentState = 'idle';
            this.currentTask = null;
            return;
        }

        this.currentTask = this.taskQueue.shift();

        if (this.currentTask.type === 'GATHER' || this.currentTask.type === 'MOVE' || this.currentTask.type === 'ATTACK') {
            const currentGridX = Math.floor(this.x / this.scene.tileSize);
            const currentGridY = Math.floor(this.y / this.scene.tileSize);
            
            this.currentPath = Pathfinder.findPath(this.scene.gridMatrix, currentGridX, currentGridY, this.currentTask.x, this.currentTask.y);
            
            if (this.currentPath.length > 0) {
                this.currentPath.shift(); // Remover nodo inicial
                this.currentState = 'moving';
                this.moveNextNode();
            } else {
                this.processNextTask(); // Inaccesible, pasar a la siguiente tarea
            }
        }
    }

    moveNextNode() {
        if (this.currentPath.length === 0) {
            // Llegó al destino de la tarea actual
            if (this.currentTask) {
                if (this.currentTask.type === 'GATHER') {
                    this.startGathering(this.currentTask.resource);
                } else if (this.currentTask.type === 'ATTACK') {
                    this.startAttacking(this.currentTask.target);
                } else {
                    this.processNextTask(); 
                }
            } else {
                this.currentState = 'idle';
            }
            return;
        }

        const nextNode = this.currentPath.shift();
        const targetPixelX = nextNode.x * this.scene.tileSize;
        const targetPixelY = nextNode.y * this.scene.tileSize;

        this.scene.tweens.add({
            targets: this,
            x: targetPixelX,
            y: targetPixelY,
            duration: 300,
            onUpdate: () => {
                this.hpBar.setPosition(this.x, this.y);
            },
            onComplete: () => {
                this.moveNextNode();
            }
        });
    }

    // --- RECOLECCIÓN Y COMBATE ---

    startGathering(resourceType) {
        this.currentState = 'working';
        this.workTimer = this.scene.time.addEvent({
            delay: 2000,
            callback: () => this.gatherTick(resourceType),
            callbackScope: this,
            loop: true
        });
    }

    gatherTick(resourceType) {
        if (this.currentState !== 'working' || this.rest < 10) {
            this.stopWorking();
            return;
        }

        if (this.isEnemy) {
            this.scene.enemyTribe.resources[resourceType] += 5;
        } else {
            const currentAmount = this.scene.registry.get(resourceType);
            this.scene.registry.set(resourceType, currentAmount + 5);
        }

        this.rest -= 8;
        
        // Animación de recolección
        this.scene.tweens.add({ targets: this, y: this.y - 5, yoyo: true, duration: 150 });
        this.hpBar.setPosition(this.x, this.y); // Ajustar barra de vida al saltar
    }

    startAttacking(targetEntity) {
        this.currentState = 'attacking';
        this.targetEntity = targetEntity;
        
        this.attackTimer = this.scene.time.addEvent({
            delay: 1500,
            callback: () => this.attackTick(),
            callbackScope: this,
            loop: true
        });
    }

    attackTick() {
        if (this.currentState !== 'attacking' || !this.targetEntity || !this.targetEntity.scene) {
            this.stopWorking();
            return;
        }

        this.targetEntity.health -= 15;
        this.rest -= 2; 

        // Feedback de daño
        this.targetEntity.setTint(0xff0000);
        if (this.targetEntity.hpBar) this.targetEntity.hpBar.setHealth(this.targetEntity.health);
        
        this.scene.time.delayedCall(200, () => {
            if (this.targetEntity && this.targetEntity.health > 0) {
                this.targetEntity.isEnemy ? this.targetEntity.setTint(0xff4444) : this.targetEntity.clearTint();
            }
        });

        // Animación de ataque (embestida)
        this.scene.tweens.add({ targets: this, scaleX: 1.2, scaleY: 1.2, yoyo: true, duration: 100 });

        if (this.targetEntity.health <= 0) {
            if (this.targetEntity.hpBar) this.targetEntity.hpBar.destroy();
            this.targetEntity.destroy();
            this.stopWorking();
        }
    }

    stopWorking() {
        if (this.workTimer) {
            this.workTimer.remove();
            this.workTimer = null;
        }
        if (this.attackTimer) {
            this.attackTimer.remove();
            this.attackTimer = null;
        }
        this.currentState = 'idle';
        this.processNextTask();
    }
}
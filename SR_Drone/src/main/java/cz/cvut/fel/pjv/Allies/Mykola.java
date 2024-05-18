package cz.cvut.fel.pjv.Allies;

import cz.cvut.fel.pjv.Drone.Drone;
import cz.cvut.fel.pjv.Drone.Payload;
import cz.cvut.fel.pjv.Drone.Supplies;
import cz.cvut.fel.pjv.Enemy.Enemy;

import java.util.List;

public class Mykola {
    // Attributes
    private String[] inventory;

    // Constructor
    public Mykola() {
        this.inventory = new String[5];//default;
    }

    // Methods
    public void rechargeDrone(Drone drone) {
        // Logic to recharge the drone
    }

    public void collectSupplies(Supplies supplies) {
        // Logic to collect supplies
    }

    public void refillPayload(Payload payload) {
        // Logic to refill payload
    }

    public void checkEnemies(List<Enemy> enemyList) {
        // Logic to check enemies
    }
}

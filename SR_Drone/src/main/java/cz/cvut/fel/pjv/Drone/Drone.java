package cz.cvut.fel.pjv.Drone;

import cz.cvut.fel.pjv.Enemy.Enemy;
import cz.cvut.fel.pjv.Enemy.REB;

public class Drone {
    // Attributes of the class
    private String directionOfMovement; // Direction of movement
    private String equippedItem; // Equipment equipped on the drone
    private int batteryLevel; // Battery level
    private int points; // Points
    private boolean inREBRange; // Indicates whether the drone is in the REB range

    // Constructor of the class
    public Drone() {
        // Initialize the drone attributes
        this.directionOfMovement = "forward"; // default
        this.equippedItem = "none"; // Initial equipment
        this.batteryLevel = 100; // Initial battery level
        this.points = 0; // Initial points
        this.inREBRange = false; // Initially, the drone is not in the REB range
    }

    // Methods of the class

    // Method to change the direction of movement
    public void move(String direction) {
        this.directionOfMovement = direction;
        // Additional actions related to drone movement can be added here
    }

    // Method to equip the drone with equipment
    public void equip(String item) {
        this.equippedItem = item;
        // Additional actions related to equipping the drone can be added here
    }

    // Method to drop payload
    public void dropPayload(String target) {
        // Implementation of dropping payload on a specific target
    }

    // Method to drop supplies for allies
    public void dropSupplies(String ally) {
        // Implementation of dropping supplies for a specific ally
    }

    // Method to take battery charge
    public void takeBatteryCharge(int charge) {
        this.batteryLevel += charge;
        // Additional actions related to battery charging can be added here
    }

    // Method to give supplies to an NPC
    public void giveSuppliesTo(String npc) {
        // Implementation of giving supplies to a specific NPC
    }

    // Method to attach a hook
    public void attachHook() {
        // Implementation of attaching a hook to the drone
    }

    // Method to loot enemy supplies
    public void lootEnemySupplies(Enemy enemy) {
        // Implementation of looting enemy supplies
    }

    // Method to check if the drone is in the REB range
    public void checkREBRange(REB reb) {
        // Implementation of checking the REB range
    }

    // Method to destroy the drone
    public void destroy() {
        // Implementation of destroying the drone
    }
}

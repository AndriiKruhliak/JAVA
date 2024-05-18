package cz.cvut.fel.pjv.Drone;

public class Battery {
    // Attribute to store the charge level
    private int chargeLevel;

    // Constructor to initialize the charge level
    public Battery(int initialCharge) {
        this.chargeLevel = initialCharge;
    }

    // Method to drain power from the battery
    public void drain(int power) {
        if (power > chargeLevel) {
            chargeLevel = 0;
        } else {
            chargeLevel -= power;
        }
    }

    // Method to recharge the battery
    public void recharge() {
        // Logic to recharge the battery
        System.out.println("Recharging the battery");
    }
}

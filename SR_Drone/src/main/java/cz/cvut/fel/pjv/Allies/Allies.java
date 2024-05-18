package cz.cvut.fel.pjv.Allies;

import java.util.ArrayList;
import java.util.List;

public class Allies {
    // Attribute to store the points
    private int points;

    // Constructor
    public Allies() {
        this.points = 0;
    }

    // Method to receive supplies
    public void receiveSupplies(String supplies) {
        // Process the received supplies
        System.out.println("Received supplies: " + supplies);
    }

    // Method to add points
    public void addPoints(int points) {
        this.points += points;
    }

    // Method to deduct points
    public void deductPoints(int points) {
        this.points -= points;
    }
}
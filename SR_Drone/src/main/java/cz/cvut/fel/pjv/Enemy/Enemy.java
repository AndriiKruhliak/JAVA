package cz.cvut.fel.pjv.Enemy;

public abstract class Enemy {
    private String type;

    public Enemy(String type) {
        this.type = type;
    }

    public abstract double calculateDistance(int[] dronePosition);

    public abstract void addPoints(int points);
}

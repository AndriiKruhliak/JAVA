package cz.cvut.fel.pjv.Enemy;

public class Bunker extends Enemy {
    private String animation;

    public Bunker(String type, String animation) {
        super(type);
        this.animation = animation;
    }

    @Override
    public double calculateDistance(int[] dronePosition) {
        // Implement calculation
        return 0.0;
    }

    @Override
    public void addPoints(int points) {
        // Implement adding points
    }

    public void changeAnimation(double distanceToDrone) {
        // Implement animation change
    }
}

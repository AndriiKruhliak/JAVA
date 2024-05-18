package cz.cvut.fel.pjv.Enemy;

public class REB extends Enemy {
    /*
    *
    *
    *           Electronic Warfare System = REB
    *
     */

    private double radiusOfAction;

    public REB(String type, double radiusOfAction) {
        super(type);
        this.radiusOfAction = radiusOfAction;
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
}

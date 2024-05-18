package cz.cvut.fel.pjv.Game;

public class GameObject {
    private Position position;
    private Size size;

    public GameObject(){
        position = new Position(50,50);
        size = new Size(50,50);

    }
    public abstract void update();
    public abstract Image getSprite();



}

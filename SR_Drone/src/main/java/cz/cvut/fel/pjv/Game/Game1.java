package cz.cvut.fel.pjv.Game;

import cz.cvut.fel.pjv.Game.Display;

import java.awt.*;

public class Game1 {
    private Display display;
    public Rectangle rectangle;

    public Game1(int width, int height) {
        display = new Display(width, height); // Use provided width and height
        rectangle = new Rectangle(0, 0, 50, 50);
    }

    public void update() {
        rectangle.setLocation((int) rectangle.getX() + 1, (int) rectangle.getY());
    }

    public void render() {
        display.render(this);
    }

    public Rectangle getRectangle() {
        return rectangle;
    }
}

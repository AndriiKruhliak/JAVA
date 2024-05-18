package cz.cvut.fel.pjv.Game;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferStrategy;

public class Display extends JFrame {
    private Canvas canvas;

    public Display(int width, int height) {
        setTitle("SR Drone");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        canvas = new Canvas();
        canvas.setPreferredSize(new Dimension(width, height));
        canvas.setFocusable(false); // Ensure canvas doesn't steal focus
        add(canvas);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);

        canvas.createBufferStrategy(3);
    }

    public void render(Game1 game){
        BufferStrategy bufferStrategy = canvas.getBufferStrategy();
        if (bufferStrategy == null) {
            canvas.createBufferStrategy(3);
            return;
        }

        Graphics graphics = bufferStrategy.getDrawGraphics();

        graphics.setColor(Color.black);
        graphics.fillRect(0, 0, canvas.getWidth(), canvas.getHeight());

        Rectangle rectangle = game.getRectangle();
        graphics.setColor(Color.blue);
        graphics.fillRect(
                (int) rectangle.getX(),
                (int) rectangle.getY(),
                (int) rectangle.getWidth(),
                (int) rectangle.getHeight()
        );

        graphics.dispose();
        bufferStrategy.show();
    }
}

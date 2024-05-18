package cz.cvut.fel.pjv.Game;

public class Launcher {
    public static void main(String[] args) {

        Game1 game = new Game1(800, 600);
        GameLoop gameLoop = new GameLoop(game);
        new Thread(gameLoop).start();
    }
}
package cz.cvut.fel.pjv.Game;

import cz.cvut.fel.pjv.Game.Game1;

public class GameLoop implements Runnable {
    private Game1 game;
    private boolean running;
    private final double updateRate = 1.0d / 60.0d;

    public GameLoop(Game1 game) {
        this.game = game;
    }

    @Override
    public void run() {
        running = true;
        double accumulator = 0;
        long currentTime, lastUpdate = System.currentTimeMillis();

        while (running) {
            currentTime = System.currentTimeMillis();
            double lastRenderTimeInSeconds = (currentTime - lastUpdate) / 1000.0;
            accumulator += lastRenderTimeInSeconds;
            lastUpdate = currentTime;

            while (accumulator >= updateRate) {
                game.update();
                accumulator -= updateRate;
            }

            game.render();
        }
    }
}

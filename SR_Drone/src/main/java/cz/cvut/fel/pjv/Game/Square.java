package cz.cvut.fel.pjv.Game;

import javax.swing.*;

public class Square extends GameObject{

    @Override
    public void update(){
        position = new Position(position.getX()+1, position.getY())
    }
    @Override
    public Image getSprite(){
        return null;
    }
}

package org.academiadecodigo.ObstaclesJorge;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Obstacle {
    public int randomX() {
        return (int) Math.floor(Math.random() * 94);
    }

    private Position positionObstacle = new Position((10*randomX())+10, -(randomX()*10));
    public Position getPositionObstacle() {
        return positionObstacle;
    }

    Picture obst = new Picture(positionObstacle.getCol(), positionObstacle.getRow(), "Resources/Characters/Beer.png");

    public Picture getObst() {
        return obst;
    }

    public void Translate() {
        obst.translate(0, 2);
        positionObstacle.setRow(getPositionObstacle().getRow() + 2);
    }
}
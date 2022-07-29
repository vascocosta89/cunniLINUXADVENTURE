package org.academiadecodigo.ObstaclesJorge;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Money {
    public int randomX() {
        return (int) Math.floor(Math.random()*94);
    }

    private Position positionMoney = new Position((10*randomX())+10, -(randomX()*10));

    public Position getPositionMoney() {
        return positionMoney;
    }

    Picture money = new Picture(positionMoney.getCol(), positionMoney.getRow(), "Resources/Characters/Money.png");

    public Picture getMoney() {
        return money;
    }

    public void Translate() {

        money.translate(0, 2);
        positionMoney.setRow(getPositionMoney().getRow() + 2);

    }
}

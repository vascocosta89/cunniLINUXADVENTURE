package org.academiadecodigo.Penguin;

import org.academiadecodigo.Grid.GameGrid;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class PenguinKeyboardHelper implements KeyboardHandler {

    CunnilinuxPenguin penguin;
//    public int direction = 1;

    public PenguinKeyboardHelper(CunnilinuxPenguin penguin) {
        this.penguin = penguin;
    }

    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {
        switch (keyboardEvent.getKey()) {
            case KeyboardEvent.KEY_RIGHT:
                if (penguin.getPenguinPosition().getCol() < GameGrid.cols * GameGrid.cellSize - 60) {
//                    penguin.moveRight();
/*                    if (direction != 1){
                        penguin.getPenguinPicture().grow(61, 0);
                        direction = 1;
                    }*/
                    penguin.getPenguinPicture().translate(2 * GameGrid.cellSize, 0);
                    penguin.setPositionPenguinCol(2 * GameGrid.cellSize);
                }
                break;
            case KeyboardEvent.KEY_LEFT:

                if (penguin.getPenguinPosition().getCol() > 20) {
//                    penguin.moveLeft();
/*                    if (direction != 0){
                        penguin.getPenguinPicture().grow(-61, 0);
                        direction = 0;
                    }*/
                    penguin.getPenguinPicture().translate(-2 * GameGrid.cellSize, 0);
                    penguin.setPositionPenguinCol(-2 * GameGrid.cellSize);

                }
                break;
        }
    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }
}
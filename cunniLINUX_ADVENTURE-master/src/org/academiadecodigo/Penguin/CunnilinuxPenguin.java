package org.academiadecodigo.Penguin;
import org.academiadecodigo.Grid.GameGrid;
import org.academiadecodigo.ObstaclesJorge.Position;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.pictures.Picture;
public class CunnilinuxPenguin {

    private Keyboard penguinKeyboard;

    Picture penguinPicture = new Picture(50*GameGrid.cellSize, 57*GameGrid.cellSize, "Resources/Characters/Penguin/walk2_right.png");

    public Picture getPenguinPicture() {
        return penguinPicture;
    }

    private Position positionPenguin = new Position(50*GameGrid.cellSize,57*GameGrid.cellSize);

    public CunnilinuxPenguin() {


        penguinPicture.draw();
    }

//    public void moveRight(){
//        penguinPicture.delete();
//      penguinPicture = new Picture(50*GameGrid.cellSize, 57*GameGrid.cellSize, "Characters/Penguin/walk2_right.png");
//penguinPicture.draw();
//    }

//    public void moveLeft(){
//        penguinPicture.delete();
//        penguinPicture = new Picture(50*GameGrid.cellSize, 57*GameGrid.cellSize, "Characters/Penguin/walk2_left.png");
//        penguinPicture.draw();
//    }


    public Position getPenguinPosition() {
        return positionPenguin;
    }

    public void Draw() {
        penguinPicture.draw();
    }

    public void setPositionPenguinCol(int change){
        positionPenguin.setCol(getPenguinPosition().getCol()+change);
    }

}
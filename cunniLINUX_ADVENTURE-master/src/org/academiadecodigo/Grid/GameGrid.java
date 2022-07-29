package org.academiadecodigo.Grid;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class GameGrid {
    public static final int PADDING = 10;
    public static int cellSize = 10;
    public static int cols = 100;
    private int rows =80;
    public Rectangle gameArea;
    Picture gameScreenBackground = new Picture(PADDING,PADDING, "Resources/Characters/Background/Background.jpeg");  // GAME SCREENS;

    public GameGrid() {
        init();
    }

    public void init() {
        this.gameArea = new Rectangle(PADDING,PADDING, cols * cellSize , rows * cellSize);
        gameArea.setColor(Color.BLACK);
        this.gameArea.draw();
        gameScreenBackground.draw();
    }
}

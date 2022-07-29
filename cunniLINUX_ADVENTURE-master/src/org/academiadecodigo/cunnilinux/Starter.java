package org.academiadecodigo.cunnilinux;

import org.academiadecodigo.Grid.GameGrid;
import org.academiadecodigo.ObstaclesJorge.ObstacleFactory;
import org.academiadecodigo.Penguin.CunnilinuxPenguin;
import org.academiadecodigo.Penguin.PenguinKeyboardHelper;
import org.academiadecodigo.Sound;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Starter implements KeyboardHandler {

    public boolean isGameRunning;
    public boolean Restart;

    public void startGame(){

        Picture startScreen = new Picture(10, 10, "Resources/Characters/Background/initialScreen.png");
        startScreen.draw();

        while (!isGameRunning){
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }


        //Game Grid Initialization
        GameGrid gameGrid = new GameGrid(); //To merge within a game init method
        gameGrid.init();

        //Penguin Initialization
        CunnilinuxPenguin peg=new CunnilinuxPenguin();
        peg.Draw();

        //Music Initialization
        Sound music = new Sound("/Resources/Characters/Audio/backgroundMusic.wav");
        music.setLoop(50);

        //Penguin keyboard Initialization
        penguinKeyboardSetup(peg);

        //Obstacle Initialization
        ObstacleFactory test1= new ObstacleFactory(peg);
        try {
            test1.generate();
            isGameRunning=false;

            while (!Restart){
                Thread.sleep(1);
            }

            //Thread.sleep(3000);
            //isGameOver=true;

            music.stop();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    //Game keyboard Initialization
    public void KeySetup(){
        Keyboard keyboard1 = new Keyboard(this);

        KeyboardEvent pressRight = new KeyboardEvent();
        pressRight.setKey(KeyboardEvent.KEY_ENTER);
        pressRight.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard1.addEventListener(pressRight);

        KeyboardEvent pressRight2 = new KeyboardEvent();
        pressRight2.setKey(KeyboardEvent.KEY_ESC);
        pressRight2.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard1.addEventListener(pressRight2);
    }

    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {
        if (keyboardEvent.getKey() == KeyboardEvent.KEY_ENTER) {
            isGameRunning = true;
        } else if (keyboardEvent.getKey() == KeyboardEvent.KEY_ESC) {
            Restart = true;
        }
    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {}

    //Penguin keyboard Initialization
    public void penguinKeyboardSetup(CunnilinuxPenguin peg){
        PenguinKeyboardHelper kbh = new PenguinKeyboardHelper(peg);
        Keyboard keyboard1 = new Keyboard(kbh);

        KeyboardEvent pressRight = new KeyboardEvent();
        pressRight.setKey(KeyboardEvent.KEY_RIGHT);
        pressRight.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard1.addEventListener(pressRight);

        //Left movement
        KeyboardEvent pressLeft = new KeyboardEvent();
        pressLeft.setKey(KeyboardEvent.KEY_LEFT);
        pressLeft.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard1.addEventListener(pressLeft);
    }
}

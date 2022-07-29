package org.academiadecodigo.Grid.Counters;

import org.academiadecodigo.Sound;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Text;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class HealthCount {
    private int healthLevel = 100;
    private int healthCurrent = 100;
    private int healthDamage = 25;
    private boolean isLiving = true;

    public void setLiving(boolean living) {
        isLiving = living;
    }
    public boolean isLiving() {
        return isLiving;
    }

    Text healthDisplay;

    public HealthCount() {
        healthDisplay = new Text(965, 50, "100");
        healthFormatting();
        heartSymbol();
    }

    //Formatting of the display
    public void healthFormatting() {
        healthDisplay.setText(String.valueOf(healthLevel));
        healthDisplay.draw();
        healthDisplay.setColor(Color.GREEN);
        healthDisplay.grow(16, 8);
    }

    public void heartSymbol() {
        Picture heartPicture = new Picture(890, 43, "Resources/Characters/CounterArt/heart.png");
        heartPicture.grow(-2, -2);
        heartPicture.draw();
    }

    //logic to handle the debt reduction through the collection of damaging items
    public void healthUpdate(int healthDamage) {
        if (healthCurrent <= 25) {
            beerOpening();
            healthCurrent = healthCurrent - healthDamage;
            healthDisplay.setColor(Color.RED);
            healthDisplay.setText(String.valueOf(healthCurrent));
            setLiving(false);
            Picture gameOver = new Picture(10,10, "Resources/Characters/Background/Background_Game_Over.jpg");
            gameOver.draw();
        } else {
            beerOpening();
            healthCurrent = healthCurrent - healthDamage;
            healthDisplay.setText(String.valueOf(healthCurrent));
        }
    }

    public void beerOpening(){
        Sound music = new Sound("/Resources/Characters/Audio/beerOpenning.wav");
        music.play(true);
    }

    public int getHealthDamage() {
        return healthDamage;
    }
}
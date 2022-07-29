package org.academiadecodigo.Grid.Counters;

import org.academiadecodigo.Sound;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Text;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class CashCount {
    private int cashDebt = 6000;
    private int currentDebt = 6000;
    private int cashCollected = 250;
    private int beerCost = 50;

    private boolean isPaid=false;
    public boolean isPaid() {
        return isPaid;
    }
    public void setPaid(boolean paid) {
        isPaid = paid;
    }

    org.academiadecodigo.simplegraphics.graphics.Text counterDisplay;

    public CashCount(){
        counterDisplay = new Text(950, 22, "6000");
        cashFormatting();
        euroSymbol(); // to inialize the euro symbol picture
    }

    //Formatting of the display
    public void cashFormatting() {
        counterDisplay.setText(String.valueOf(currentDebt));
        counterDisplay.draw();
        counterDisplay.setColor(Color.ORANGE);
        counterDisplay.grow(16,8);
    }

    public void euroSymbol(){
        Picture euroPicture = new Picture(900,17, "Resources/Characters/CounterArt/euro.png");
        euroPicture.draw();
    }

    //logic to handle the debt reduction through the collection of cash
    public void cashOwed(int cashCollected){
        if(currentDebt <= cashCollected){
            coinCollection();
            currentDebt = currentDebt-cashCollected;
            counterDisplay.setText(String.valueOf(currentDebt));
            setPaid(true);
            Picture gameVictory = new Picture(10,10, "/Resources/Characters/Audio/coinCollecting.wav");
            gameVictory.draw();
        }
        else {
            coinCollection();
            currentDebt = currentDebt-cashCollected;
            counterDisplay.setText(String.valueOf(currentDebt));
        }
    }

    public void coinCollection(){
        Sound music = new Sound("/Resources/Characters/Audio/coinCollecting.wav");
        music.play(true);
        //music.startMusic();
    }

    public int getCashCollected() {
        return cashCollected;
    }
    public int getBeerCost() {
        return beerCost;
    }

    //setter to increase the debt - hitting the beers:
    public void setCurrentDebt(int beerCost) {
        this.currentDebt = currentDebt+beerCost;
        counterDisplay.setText(String.valueOf(currentDebt));
    }
}
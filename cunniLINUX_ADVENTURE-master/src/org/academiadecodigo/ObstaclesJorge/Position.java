package org.academiadecodigo.ObstaclesJorge;

public class Position {
    private int col;
    private int row;
    public Position(int col,int row){
        this.col=col;
        this.row=row;
    }
    public int getCol(){
        return this.col;
    }
    public int getRow(){
        return this.row;
    }
    public void setRow(int row) {
        this.row = row;
    }
    public void setCol(int col) {
        this.col = col;
    }
}

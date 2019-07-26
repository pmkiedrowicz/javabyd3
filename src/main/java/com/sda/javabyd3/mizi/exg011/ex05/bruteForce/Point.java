package com.sda.javabyd3.mizi.exg011.ex05.bruteForce;

/**
 * Created by Michal Ziolecki.
 */
public class Point {

    private int numberOfPoint;
    private int posX;
    private int posY;


    public Point(int nr){
        this.numberOfPoint = nr;
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public int getNumberOfPoint() {
        return numberOfPoint;
    }

    @Override
    public String toString() {
        return "Point{" +
                "numberOfPoint=" + numberOfPoint +
                ", posX=" + posX +
                ", posY=" + posY +
                '}';
    }
}

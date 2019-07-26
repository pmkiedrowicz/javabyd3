package com.sda.javabyd3.mizi.exg010.ex02;

/**
 * Created by Michal Ziolecki.
 */
public class Point {

    private int x;
    private int y;

    public Point (int posX, int posY){
        this.x = posX;
        this.y = posY;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}

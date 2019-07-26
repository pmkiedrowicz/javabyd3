package com.sda.javabyd3.kade.exg010.ex02;

public class Point {

    int x;
    int y;

    public Point(int posX, int posY)
    {
        this.x = posX;
        this.y = posY;
    }

    @Override
    public String toString()
    {
        return "(x, y): " + x + ", " + y;
    }

    public int getX()
    {
        return x;
    }

    public int getY()
    {
        return y;
    }
}





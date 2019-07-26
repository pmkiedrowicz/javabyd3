package com.sda.javabyd3.kawa.exg007.ex04;

public class Rectangle extends Figure {

    double width;
    double length;

    public Rectangle(Parameters parameters) {
        super(parameters);
        this.width = width;
        this.length = length;
    }

    @Override
    public double countPermiter() {
        this.permiter = 2 * width + 2 * length;
        return permiter;
    }

    @Override
    public double countSurface() {
        this.surface = width * length;
        return surface;
    }

    @Override
    public void getDetailedInfo() {
        super.getDetailedInfo();
    }
}

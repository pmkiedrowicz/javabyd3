package com.sda.javabyd3.kawa.exg007.ex04;

public class Square extends Figure {

    double length;

    public Square(Parameters parameters) {
        super(parameters);
        this.length = length;
    }

    @Override
    public double countPermiter() {
        this.permiter = 4 * length;
        return super.countPermiter();
    }

    @Override
    public double countSurface() {
        this.surface = length * length;
        return super.countSurface();
    }

    @Override
    public void getDetailedInfo() {
        super.getDetailedInfo();
    }
}

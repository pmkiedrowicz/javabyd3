package com.sda.javabyd3.kawa.exg007.ex04;

public class Triangle extends Figure {

    double length;
    double height;

    public Triangle(Parameters parameters) {
        super(parameters);
        this.length = length;
        this.height = height;
    }

    @Override
    public double countPermiter() {
        double halfOfBasis = length / 2.0;
        double side = Math.sqrt(halfOfBasis * halfOfBasis + height * height);
        this.permiter = length + side + side;
        return super.countPermiter();
    }

    @Override
    public double countSurface() {
        this.surface = (length * height) / 2.0;
        return super.countSurface();
    }

    @Override
    public void getDetailedInfo() {
        super.getDetailedInfo();
    }
}

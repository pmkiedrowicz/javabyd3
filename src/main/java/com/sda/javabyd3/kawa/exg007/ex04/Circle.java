package com.sda.javabyd3.kawa.exg007.ex04;

public class Circle extends Figure {

    double radius;
    CircleParameters circleParameters;

    public Circle(Parameters parameters) {
        super(parameters);
        circleParameters = (CircleParameters) parameters;
        this.radius = circleParameters.getRadius();
    }

    @Override
    public double countPermiter() {
        this.permiter = 2*Math.PI * radius;
        return permiter;
    }

    @Override
    public double countSurface() {
        this.surface = Math.PI * Math.pow(radius,2);
        return surface;
    }

    @Override
    public void getDetailedInfo() {
        super.getDetailedInfo();
    }
}

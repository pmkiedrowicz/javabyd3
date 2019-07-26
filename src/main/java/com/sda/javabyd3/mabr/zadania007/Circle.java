package com.sda.javabyd3.mabr.zadania007;

public class Circle extends Figure {

    Double radius;
    CircleParameters cirleParameters;

    public Circle(Parameters ObjectParameters) {
        super(ObjectParameters);
        this.type = objectParam.getTitle();
        cirleParameters = (CircleParameters) ObjectParameters;
        this.radius = cirleParameters.getRadius();
        this.permiterer = 0.0d;
        this.surface = 0.0d;
    }

    @Override
    public Double countPermiter() {
        permiterer = 2 * Math.PI * radius;
        return permiterer;
    }

    @Override
    public Double countSuface() {
        surface = Math.PI * radius * radius;
        return surface;
    }

    @Override
    public void getDetailedInfo() {
        super.getDetailedInfo();
    }
}

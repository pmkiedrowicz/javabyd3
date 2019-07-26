package com.sda.javabyd3.syga.exg007.ex04;

import static java.lang.Math.pow;

public class Circle extends Figure{

    CircleParameters circleParameters;
    double pi = 3.1415;
    double r = circleParameters.getR();
    String name = "Circle";

    public Circle(CircleParameters circleParameters) {
        this.circleParameters = circleParameters;
        this.pi = pi;
        this.r = circleParameters.getR();
        this.name = name;
    }

    @Override
    public double countPermiterer(){
        double permiter = 2 * r * pi;
        return permiter;
    }

    @Override
    public double countSurface(){
        double surface = 2 * pi * pow(r,2);
        return surface;
    }

    @Override
    public void getDetailedInfo (){
        System.out.println(name);
        System.out.println("R = " + r);
        System.out.println("Permiterer = " + countPermiterer());
        System.out.println("Surface = " + countSurface());
    }
}

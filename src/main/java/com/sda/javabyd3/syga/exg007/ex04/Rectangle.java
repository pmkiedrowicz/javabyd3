package com.sda.javabyd3.syga.exg007.ex04;

public class Rectangle extends Figure{

    RectangleParameters rectangleParameters;
    double a = rectangleParameters.getA();
    double b = rectangleParameters.getB();
    String name = "Ractangle";

    public Rectangle(RectangleParameters rectangleParameters) {
        this.rectangleParameters = rectangleParameters;
        this.a = rectangleParameters.getA();
        this.b = rectangleParameters.getB();
        this.name = name;
    }

    @Override
    public double countPermiterer(){
        double result = (2 * a) + (2 * b);
        return result;
    }
    @Override
    public double countSurface(){
        double result = a * b;
        return result;
    }

    @Override
    public void getDetailedInfo (){
        System.out.println(name);
        System.out.println("A = " + a);
        System.out.println("B = " + b);
        System.out.println("Permiterer = " + countPermiterer());
        System.out.println("Surface = " + countSurface());
    }
}

package com.sda.javabyd3.syga.exg007.ex04;

public class Triangle extends Figure{
    TriangleParameters triangleParameters;
    double a = triangleParameters.getA();
    double b = triangleParameters.getB();
    double c = triangleParameters.getC();
    double h = triangleParameters.getH();
    String name = "Triangle";

    public Triangle(TriangleParameters triangleParameters) {
        this.triangleParameters = triangleParameters;
        this.a = triangleParameters.getA();
        this.b = triangleParameters.getB();
        this.c = triangleParameters.getC();
        this.h = triangleParameters.getH();
        this.name = name;
    }

    @Override
    public double countPermiterer(){
        double permiterer = 0.5 * a * h;
        return permiterer;
    }

    @Override
    public double countSurface(){
        double surface = a + b + c;
        return surface;
    }

    @Override
    public void getDetailedInfo (){
        System.out.println(name);
        System.out.println("A = " + a);
        System.out.println("B = " + b);
        System.out.println("C = " + c);
        System.out.println("H = " + h);
        System.out.println("Permiterer = " + countPermiterer());
        System.out.println("Surface = " + countSurface());
    }
}

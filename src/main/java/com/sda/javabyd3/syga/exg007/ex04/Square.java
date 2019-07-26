package com.sda.javabyd3.syga.exg007.ex04;

public class Square extends Figure {

    SquareParameters squareParameters = new SquareParameters();
    double a = squareParameters.getA();
    String name = "Square";

    public Square(SquareParameters squareParameters) {
        this.squareParameters = squareParameters;
        this.a = squareParameters.getA();
        this.name = name;
    }


    @Override
    public double countPermiterer(){
        double permiterer = 4 * a;
        return permiterer;
    }

    @Override
    public double countSurface(){
        double surface = a * a;
        return surface;
    }

    @Override
    public void getDetailedInfo (){
        System.out.println(name);
        System.out.println("A = " + a);
        System.out.println("Permiterer  = " + countPermiterer());
        System.out.println("Surface = " + countSurface());
    }
}

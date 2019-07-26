package com.sda.javabyd3.syga.exg007.ex04;

public class RectangleParameters extends Parameters {

    double a = 0.0d;
    double b = 0.0d;

    @Override
    public void getFigureParametersFromUser(){
        System.out.println("Enter the shorter and longer side of the rectangle with one decimal place.");
        System.out.println("A = ");
        a = scanner.nextDouble();
        System.out.println("B = ");
        b = scanner.nextDouble();
    }

    public double getA(){return a;}

    public double getB(){return b;}
}

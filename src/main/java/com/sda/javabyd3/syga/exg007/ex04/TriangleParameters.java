package com.sda.javabyd3.syga.exg007.ex04;

public class TriangleParameters extends Parameters {

    double a;
    double b;
    double c;
    double h;

    @Override
    public void getFigureParametersFromUser(){
        System.out.println("Enter all sides of the triangle and the height to the nearest decimal place.");
        System.out.println("A = ");
        a = scanner.nextDouble();
        System.out.println("B = ");
        b = scanner.nextDouble();
        System.out.println("C = ");
        c = scanner.nextDouble();
        System.out.println("H = ");
        h = scanner.nextDouble();
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getH() {
        return h;
    }
}

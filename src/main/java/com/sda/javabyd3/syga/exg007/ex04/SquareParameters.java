package com.sda.javabyd3.syga.exg007.ex04;

public class SquareParameters extends Parameters {

    double a = 0.0d;

    @Override
    public void getFigureParametersFromUser(){
        System.out.println("Enter the side of the square with the accuracy of one decimal place.");
        System.out.println("A = ");
        a = scanner.nextDouble();
    }

    public double getA(){return a;}
}

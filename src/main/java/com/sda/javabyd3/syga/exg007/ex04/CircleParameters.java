package com.sda.javabyd3.syga.exg007.ex04;
/**
 * Getting the data needed to calculate the surface and perimeter.
 */


public class CircleParameters extends Parameters {
    double r;

    @Override
    public void getFigureParametersFromUser(){
        System.out.println("Enter the radius of the circle to one decimal place");
        r = scanner.nextDouble();
    }

    public double getR(){
        return r;
    }
}

package com.sda.javabyd3.kawa.exg007.ex04;

import java.util.Scanner;

public class CircleParameters extends Parameters {

    double radius;

    public CircleParameters() {
        super();
        this.radius = radius;
        this.type = " okrag ";
    }

    @Override
    public double scanParameters() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wymiar promienia: ");
        this.radius = scanner.nextDouble();
        return radius;
    }

    @Override
    public String getType() {
        return super.getType();
    }

    public double getRadius() {
        return radius;
    }
}

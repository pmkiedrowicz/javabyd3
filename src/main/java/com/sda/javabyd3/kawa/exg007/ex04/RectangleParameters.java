package com.sda.javabyd3.kawa.exg007.ex04;

import java.util.Scanner;

public class RectangleParameters extends Parameters {

    double width;
    double length;

    public RectangleParameters() {
        super();
        this.width = width;
        this.length = length;
        this.type = " prostokat ";
    }

    @Override
    public double scanParameters() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wymiar dla szerokosci: ");
        this.width = scanner.nextDouble();
        System.out.println("Podaj wymiar dla dlugosci: ");
        this.length = scanner.nextDouble();
        return super.scanParameters();
    }

    @Override
    public String getType() {
        return super.getType();
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }
}

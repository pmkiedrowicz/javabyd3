package com.sda.javabyd3.kawa.exg007.ex04;

import java.util.Scanner;

public class TriangleParameters extends Parameters {

    double length;
    double height;

    public TriangleParameters() {
        super();
        this.length = length;
        this.height = height;
        this.type = " trojkat ";
    }

    @Override
    public double scanParameters() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wymiar dlugosci podstawy:");
        this.length = scanner.nextDouble();
        System.out.println("Podaj wymiar wysokosci trojkata: ");
        this.height = scanner.nextDouble();
        return super.scanParameters();
    }

    @Override
    public String getType() {
        return super.getType();
    }

    public double getLength() {
        return length;
    }

    public double getHeight() {
        return height;
    }
}

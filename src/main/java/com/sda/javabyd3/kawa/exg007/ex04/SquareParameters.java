package com.sda.javabyd3.kawa.exg007.ex04;

import java.util.Scanner;

public class SquareParameters extends Parameters {

    double length;

    public SquareParameters() {
        super();
        this.length = length;
        this.type = " kwadrat ";
    }

    @Override
    public double scanParameters() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wymiar dlugosci boku: ");
        this.length = scanner.nextDouble();
        return super.scanParameters();
    }

    @Override
    public String getType() {
        return super.getType();
    }

    public double getLength() {
        return length;
    }
}

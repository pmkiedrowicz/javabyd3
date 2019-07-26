package com.sda.javabyd3.mizi.exg007.Zad4.Zad4f_h;

import java.util.Scanner;

/**
 * Created by Michal Ziolecki.
 */
public class TriangleParameters extends Parameters {

    Double basis;
    Double height;
    Scanner scanner;
    public TriangleParameters () {
        super();
        this.basis = 0.0d;
        this.height = 0.0d;
        this.scanner = new Scanner( System.in );
    }

    @Override
    public void setFigureParametersFromUser() {
        System.out.println(" Podaj tytuł: ");
        this.title = scanner.nextLine();
        System.out.println(" Podaj dl. podstawy: ");
        this.basis = scanner.nextDouble();
        System.out.println(" Podaj wysokosc: ");
        this.height = scanner.nextDouble();
    }

    @Override
    public String getTitle() {
        return super.getTitle();
    }

    public Double getBasis()
    {
        return basis;
    }

    public Double getHeight()
    {
        return height;
    }
}

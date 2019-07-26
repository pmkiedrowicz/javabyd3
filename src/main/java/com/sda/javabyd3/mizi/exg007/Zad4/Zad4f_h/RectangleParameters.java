package com.sda.javabyd3.mizi.exg007.Zad4.Zad4f_h;

import java.util.Scanner;

/**
 * Created by Michal Ziolecki.
 */
public class RectangleParameters extends Parameters {

    Double width;
    Double legnth;
    Scanner scanner;
    public RectangleParameters() {
        super();
        this.width = 0.0d;
        this.legnth = 0.0d;
        this.scanner = new Scanner( System.in );
    }

    @Override
    public void setFigureParametersFromUser() {
        System.out.println(" Podaj tytuł: ");
        this.title = scanner.nextLine();
        System.out.println(" Podaj szerokosc: ");
        this.width = scanner.nextDouble();
        System.out.println(" Podaj dlugosc: ");
        this.legnth = scanner.nextDouble();
    }

    @Override
    public String getTitle() {
        return super.getTitle();
    }

    public Double getWidth()
    {
        return width;
    }

    public Double getLength()
    {
        return legnth;
    }
}

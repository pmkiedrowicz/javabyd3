package com.sda.javabyd3.mizi.exg007.Zad4.Zad4f_h;

import java.util.Scanner;

/**
 * Created by Michal Ziolecki.
 */
public class CircleParameters extends Parameters {

    Double radius;
    Scanner scanner;
    public CircleParameters() {
        super();
        this.radius = 0.0d;
        this.scanner = new Scanner( System.in );
    }

    @Override
    public void setFigureParametersFromUser() {
        System.out.println(" Podaj tytuł: ");
        this.title = scanner.nextLine();
        System.out.println(" Podaj promien: ");
        this.radius = scanner.nextDouble();
    }

    @Override
    public String getTitle() {
        return super.getTitle();
    }

    public Double getRadius()
    {
        return radius;
    }
}

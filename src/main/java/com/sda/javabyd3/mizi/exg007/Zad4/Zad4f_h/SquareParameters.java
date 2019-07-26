package com.sda.javabyd3.mizi.exg007.Zad4.Zad4f_h;

import java.util.Scanner;

/**
 * Created by Michal Ziolecki.
 */
public class SquareParameters extends Parameters {

    Double side;
    Scanner scanner;
    public SquareParameters() {
        super();
        this.side = 0.0d;
        this.scanner = new Scanner( System.in );
    }

    @Override
    public void setFigureParametersFromUser() {
        System.out.println(" Podaj tytuł: ");
        this.title = scanner.nextLine();
        System.out.println(" Podaj bok: ");
        this.side = scanner.nextDouble();
    }

    @Override
    public String getTitle() {
        return super.getTitle();
    }

    public Double getSide()
    {
        return side;
    }
}

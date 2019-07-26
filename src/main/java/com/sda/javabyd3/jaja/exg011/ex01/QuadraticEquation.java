package com.sda.javabyd3.jaja.exg011.ex01;

public class QuadraticEquation {

    public String calculateDelta(double a, double b, double c) {
        String textX1 = "x1 = ";
        String textX2 = "\nx2 = ";
        String textX0 = "\nx0 = ";
        double x1 = 0;
        double x2 = 0;
        double x0 = 0;
        double delta = (b * b) - 4 * a * c;
        double sqrtDelta = Math.sqrt(delta);
        if (sqrtDelta > 0) {
            x1 = ((-b) - (sqrtDelta)) / (2 * a);
            x2 = ((-b) + sqrtDelta) / (2 * a);
        } else if (sqrtDelta == 0) {
            x0 = (-b) / (2 * a);
        } else System.out.println("Delta jest ujemna :( BRAK ROZWIĄZANIA!!!");
        return textX1 + x1 + textX2 + x2 + textX0 + x0;
    }
}


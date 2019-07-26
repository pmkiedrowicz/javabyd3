package com.sda.javabyd3.jaja.exg007.ex01;

public class TemperatureConverter {

    public double celsiusToFahrenheite(double C){
        double F;
        F = (C * 1.8) + 32;
            return F;
    }

    public double fahrenheiteToCesius(double F){
        double C;
        C = (F - 32)/1.8;
        return C;
    }
}

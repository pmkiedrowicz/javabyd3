package com.sda.javabyd3.kawa.exg007.ex01;

public class TemperatureConverter {

    public double convertingCtoF(double temperatureC) {
        return (32 + temperatureC *9/5);
    }

    public double convertingFtoC(double temperatureF) {
        return ((temperatureF - 32) * 5 / 9);
    }
}

package com.sda.javabyd3.toki.exg007oop.ex01;

public class ConverterToCelsius {
    public ConverterToCelsius() {
    }

    public double convertItToCelsius(double Temperature) {

        Temperature=(Temperature-32)*5/9;

        return Temperature;
    }

}

package com.sda.javabyd3.kawa.exg007.ex01;

public class Main {
    public static void main(String[] args) {

        TemperatureConverter temperatureConverter = new TemperatureConverter();
        System.out.println("Temperature '30' from C to F -> " + temperatureConverter.convertingCtoF(30));
        System.out.println("Temperature '30' from F to C -> " + temperatureConverter.convertingFtoC(30));

    }
}

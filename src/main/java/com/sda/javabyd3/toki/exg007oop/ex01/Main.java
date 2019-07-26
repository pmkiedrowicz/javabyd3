package com.sda.javabyd3.toki.exg007oop.ex01;

public class Main {
    public static void main(String[] args) {
        double Temperature = 26;

        System.out.println("Temperature to convert: " + Temperature);

        ConverterToCelsius converterToCelsius = new ConverterToCelsius();
        converterToCelsius.convertItToCelsius(Temperature);
        System.out.println("Temperature in Celsius: "+converterToCelsius.convertItToCelsius(Temperature));


        ConverterToFahrenheit converterToFahrenheit = new ConverterToFahrenheit();
        converterToFahrenheit.convertItToFahrenheit(Temperature);
        System.out.println("Temperature in Fahrenheit: "+converterToFahrenheit.convertItToFahrenheit(Temperature));


    }
}

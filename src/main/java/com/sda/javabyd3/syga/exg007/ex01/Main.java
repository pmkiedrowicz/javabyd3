package com.sda.javabyd3.syga.exg007.ex01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ConvertForFahrenheit convertForFahrenheit = new ConvertForFahrenheit();
        ConvertForCelsius convertForCelsius = new ConvertForCelsius();
        String choice = "";
        double temperature;
        System.out.println("If you want convert for Celsius write c, but if you want convert for Fahrenheit write f");
        choice = scanner.nextLine();

        if (choice.equals("c")){
            System.out.println("Enter the temperature in Fahrenheit:");
            temperature = scanner.nextInt();
            System.out.println("Given temparature in Celsius: " + convertForCelsius.convertForCelsius(temperature));
        }else if (choice.equals("f")){
            System.out.println("Enter the temaperature in Celsius: ");
            temperature = scanner.nextInt();
            System.out.println("Given temperature in Fahrenheit: " + convertForFahrenheit.convertForFahrenheit(temperature));
        }else {
            System.out.println("Wrong answer. ");
        }
    }
}

package com.sda.javabyd3.urdu.exg007.ex01;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ConvertTemperature convertTemperature = new ConvertTemperature();
        Scanner scanData = new Scanner(System.in);
        System.out.println("Podaj temperaturę: ");
        double temperature = scanData.nextDouble();
        String answer;

        System.out.println("Napisz C jeśli chcesz przekonwertować na celcjusze, a F jeśli na Fahrenheita");
        answer = scanData.next().toUpperCase();

        if (answer.equals("F")) {
            System.out.printf("%.2f",convertTemperature.convertToFahrenheit(temperature));
        } else if (answer.equals("C")) {
            System.out.printf("%.2f",convertTemperature.convertToCelcius(temperature));
        } else {
            System.out.println("Podałeś zły znak, a tak ładnie prosiłam.");
        }

    }
}

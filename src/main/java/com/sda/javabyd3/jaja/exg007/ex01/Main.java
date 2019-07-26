package com.sda.javabyd3.jaja.exg007.ex01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        TemperatureConverter converter = new TemperatureConverter();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Jeżeli chcesz zamienic C->F wcisnij 'C' jezeli F->C wcisnij 'F': ");
        String answer = scanner.nextLine();
        if (answer.equals("C")) {
            System.out.println("Podaj ilość stopni w Celcjuszach: ");
            double celsius = scanner.nextDouble();
            System.out.println(celsius + " stopni Celcjusza to " + converter.celsiusToFahrenheite(celsius) + " stopni Fahrenheita");
        }else if (answer.equals("F")){
            System.out.println("Podaj ilość stopni w Fahrenheitach: ");
            double fahrenheita = scanner.nextDouble();
            System.out.println(fahrenheita + " stopni Fahrenheita to " + converter.fahrenheiteToCesius(fahrenheita) + " stopni Celcjusza");
        } else System.out.println("Nieprawidłowy wybór.");
    }
}
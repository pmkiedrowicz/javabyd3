package com.sda.javabyd3.jaja.exg014.ex02;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        SumIntegers sumIntegers = new SumIntegers();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę: ");
        int number = scanner.nextInt();
        System.out.println("Suma: " + sumIntegers.sumInteger(number));
    }
}

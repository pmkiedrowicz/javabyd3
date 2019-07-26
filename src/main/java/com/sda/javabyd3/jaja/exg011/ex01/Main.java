package com.sda.javabyd3.jaja.exg011.ex01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        QuadraticEquation quadraticEquation = new QuadraticEquation();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Obliczanie miejsc zerowych równania kwadratowego a^2 + bx + c = 0");
        System.out.println("podaj a: ");
        double number = scanner.nextDouble();
        System.out.println("podaj b: ");
        double number1 = scanner.nextDouble();
        System.out.println("podaj c: ");
        double number2 = scanner.nextDouble();
        System.out.println(quadraticEquation.calculateDelta(number, number1, number2));
    }
}

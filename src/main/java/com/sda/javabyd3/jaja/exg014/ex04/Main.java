package com.sda.javabyd3.jaja.exg014.ex04;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Fibbonaci fibonacci = new Fibbonaci();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę dla której chcesz obliczyć ciąg fibbonaciego: ");
        Integer number = scanner.nextInt();
        System.out.println("Wynik to: " + fibonacci.fibo(number));

    }
}

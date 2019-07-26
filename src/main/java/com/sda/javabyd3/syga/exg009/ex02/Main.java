package com.sda.javabyd3.syga.exg009.ex02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj dowolną liczbę calkowita: ");
        Integer number = scanner.nextInt();
        FindNearestPrime findNearestPrime = new FindNearestPrime();
        System.out.println("Najbliższa liczba pierwsza to: " + findNearestPrime.findPrime(number));
    }
}

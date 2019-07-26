package com.sda.javabyd3.kawa.exg009.ex02;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj dowolna liczbe calkowita: ");
        int number = scanner.nextInt();

        FindNearestPrime findNearestPrime = new FindNearestPrime();

        System.out.println("Najblizsza liczba pierwsza to - " + findNearestPrime.findPrime(number));
    }
}

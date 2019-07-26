package com.sda.javabyd3.daol.exg009.ex02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj dowolną liczbę całkowitą: ");
        Integer number = scanner.nextInt();
        FindNearestPrime findNearestPrime = new FindNearestPrime();
        System.out.println("najbliższa liczba pierwsza to: " + findNearestPrime.findPrime(number));
    }

}

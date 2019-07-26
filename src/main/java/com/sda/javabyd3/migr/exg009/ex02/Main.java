package com.sda.javabyd3.migr.exg009.ex02;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("podaj dowolną liczbę: ");
        Integer number = scanner.nextInt();
        FindNearestPrime findNearestPrime = new FindNearestPrime();

        System.out.println("Najbliższa liczba pierwsza to: " + findNearestPrime.findPrime(number));
    }
}

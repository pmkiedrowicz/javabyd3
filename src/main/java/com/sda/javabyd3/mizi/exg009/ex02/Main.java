package com.sda.javabyd3.mizi.exg009.ex02;

import java.util.Scanner;

/**
 * Napisz program, który po wpisaniu dowolnej liczby całkowitej (int) poda najbliższą
 * liczbę pierwszą. W przypadku pojawienia się dwóch o tej samej bliskości, wybierze
 * większą. np. 6 -> 7, a nie 5.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj dowolna liczbe calkowita: ");
        Integer number = scanner.nextInt();
        FindNearestPrime findNearestPrime = new FindNearestPrime();
        System.out.println("Najbliższa liczba pierwsza to: "
                + findNearestPrime.findPrime(number));
    }
}

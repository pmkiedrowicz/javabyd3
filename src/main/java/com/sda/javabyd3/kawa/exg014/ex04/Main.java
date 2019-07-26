package com.sda.javabyd3.kawa.exg014.ex04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ktory wyraz ciagu Fibonacciego wyswietlic: ");
        int myNumber = scanner.nextInt();

        CalcFibbo calcFibbo = new CalcFibbo();
        long start = System.nanoTime();
        System.out.println(calcFibbo.calculatinFibboWithRecursion(myNumber));
        long stop = System.nanoTime() - start;
        System.out.println("Czas trwania z rekurencja - " + stop);
        start = System.nanoTime();
        System.out.println(calcFibbo.callculatinFibboWithoutRecursion(myNumber));
        stop = System.nanoTime() - start;
        System.out.println("Czas trwania bez rekurencji - " + stop);

    }
}

package com.sda.javabyd3.mizi.exg014.ex04;

import java.util.Scanner;

/**
 * Created by Michal Ziolecki.
 */
public class Main04 {
    public static void main(String[] args) {
        Fibonacci fibbonaci = new Fibonacci();
        Scanner scanner = new Scanner( System.in );
        System.out.println("Write here number of position in Fibonacci algorithm You want to calculate: ");
        int number = scanner.nextInt();

        long timeStart1 = System.currentTimeMillis();
        System.out.println(" Answer (method with loop): " + fibbonaci.FibonacciAlgorithm( number ));
        long timeEnd1 = System.currentTimeMillis();
        long timeOfAlgorithm = timeEnd1 - timeStart1;
        System.out.println(" Czas algorytmu w petli: " + timeOfAlgorithm + " ms");

        long timeStart2 = System.currentTimeMillis();
        System.out.println(" Answer (method with recursion): " + fibbonaci.FibonacciAlgorithmWithRecursion( number ));
        long timeEnd2 = System.currentTimeMillis();
        timeOfAlgorithm = timeEnd2 - timeStart2;
        System.out.println(" Czas algorytmu rekurencyjnego: " + timeOfAlgorithm + " ms");
    }
}

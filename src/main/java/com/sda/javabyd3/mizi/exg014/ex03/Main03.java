package com.sda.javabyd3.mizi.exg014.ex03;

import com.sda.javabyd3.mizi.exg014.ex02.SumCalculator;

import java.util.Scanner;

/**
 * Created by Michal Ziolecki.
 */
public class Main03 {
    public static void main(String[] args) {
        StrongCalculator strongCalculator = new StrongCalculator();
        Scanner scanner = new Scanner( System.in );
        System.out.println("Write how many numbers sum: ");
        int number = scanner.nextInt();

        long timeStart1 = System.currentTimeMillis();
        System.out.println("Strong of number in loop: " + strongCalculator.strong( number ));
        long timeEnd1 = System.currentTimeMillis();
        long timeOfAlgorithm = timeEnd1 - timeStart1;
        System.out.println(" Czas algorytmu w petli: " + timeOfAlgorithm + " ms");

        long timeStart2 = System.currentTimeMillis();
        System.out.println("Strong of number with recursion: " + strongCalculator.strongWithRecursion( number ));
        long timeEnd2 = System.currentTimeMillis();
        timeOfAlgorithm = timeEnd2 - timeStart2;
        System.out.println(" Czas algorytmu rekurencyjnego: " + timeOfAlgorithm + " ms");
    }
}

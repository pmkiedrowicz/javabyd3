package com.sda.javabyd3.syga.exg014.ex02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SumRecursion sumRecursion = new SumRecursion();
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        long start = System.nanoTime();
        System.out.println(sumRecursion.sumRecursion(number));
        long end = System.nanoTime();
    }
}

package com.sda.javabyd3.daol.exg014.ex02;


import java.util.Scanner;

public class Main {
    private static Scanner scan = new Scanner(System.in);
    IntegersSum integersSum = new IntegersSum();

    public static void main(String[] args) {
        System.out.println("Please enter number: ");
        int n = scan.nextInt();
        int recursion = IntegersSum.sumRecursion(n);
        System.out.println("Recursion: " + recursion);
    }

}

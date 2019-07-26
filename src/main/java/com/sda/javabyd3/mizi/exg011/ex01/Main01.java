package com.sda.javabyd3.mizi.exg011.ex01;

import java.util.Scanner;

/**
 * Created by Michal Ziolecki.
 */
public class Main01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        FunctionCalculator functionCalculator = new FunctionCalculator();
        System.out.println("Policz funkcje kwadratowa A*x^2 + B*x + C: ");
        System.out.println("Podaj A:");
        int a = scanner.nextInt();
        System.out.println("Podaj B:");
        int b = scanner.nextInt();
        System.out.println("Podaj C:");
        int c = scanner.nextInt();
        functionCalculator.quadraticFunction( a, b, c );
    }
}

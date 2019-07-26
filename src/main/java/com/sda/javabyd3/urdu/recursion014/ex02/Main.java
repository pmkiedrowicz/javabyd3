package com.sda.javabyd3.urdu.recursion014.ex02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        SumWithRecuAndLoop sumWithRecuAndLoop = new SumWithRecuAndLoop();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj zakres do sumowania ");
        int number = scanner.nextInt();
        int sum = sumWithRecuAndLoop.sumRecursion(number);
        int sum2 = sumWithRecuAndLoop.sumWithLoop(number);

        System.out.println("Suma liczb od 0 do "+ number + " wynosi: "+ sum);
        System.out.println("Suma liczb od 0 do "+ number + " wynosi: "+ sum2);
    }
}

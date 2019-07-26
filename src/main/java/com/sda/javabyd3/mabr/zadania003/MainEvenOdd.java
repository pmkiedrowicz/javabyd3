package com.sda.javabyd3.mabr.zadania003;

import java.util.Scanner;

public class MainEvenOdd {

    public static void main(String[] args) {

        Integer number;
        Scanner read = new Scanner(System.in);
        number = read.nextInt();

        EvenOdd zad1 = new EvenOdd();
        if (zad1.Check(number)) {
            System.out.println("Liczba " + number + " jest parzysta");
        } else {
            System.out.println("Liczba " + number + " jest nieparzysta");
        }
    }
}

package com.sda.javabyd3.kawa.exg001.ogolne.ex01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Scan3Numbers {

    int firstNumber;
    int secondNumber;
    int thirdNumber;

    public void scaningNumbers() {

        boolean valid = false;
        do {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter first number: ");
                firstNumber = scanner.nextInt();
                System.out.println("Enter second: ");
                secondNumber = scanner.nextInt();
                System.out.println("Enter third: ");
                thirdNumber = scanner.nextInt();
                valid = true;
            } catch (InputMismatchException e) {
                System.out.println("Podany znak nie jest liczba!");
            }

        }
        while (!valid);
    }

}



package com.sda.javabyd3.daol.exg003.ex01;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        EvenOddChecker evenOddChecker = new EvenOddChecker();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę:");
        int number = scanner.nextInt();
        evenOddChecker.checkerNumbers(number);

        System.out.println(evenOddChecker.checkerNumbers(number)?"Liczba jest parzysta":"Liczba jest nieparzysta");
    }

}

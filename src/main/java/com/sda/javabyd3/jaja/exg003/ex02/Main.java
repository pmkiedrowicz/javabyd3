package com.sda.javabyd3.jaja.exg003.ex02;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        CheckNumberIsPrime checkNumberIsPrime = new CheckNumberIsPrime();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę:");
        int number = scanner.nextInt();
        System.out.println(checkNumberIsPrime.primeNumbers(number) ? "Podana liczba " + number + " jest liczbą pierwsza." : "Podana liczba " + number + " nie jest liczbą pierwsza");
    }
}

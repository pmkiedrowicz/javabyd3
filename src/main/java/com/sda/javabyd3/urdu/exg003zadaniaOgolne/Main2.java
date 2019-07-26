package com.sda.javabyd3.urdu.exg003zadaniaOgolne;

import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {

        CheckPrimeNumbers met2 = new CheckPrimeNumbers();
        Ex02 ex02 = new Ex02();
        Scanner scanNumber = new Scanner(System.in);
        System.out.println("Podaj liczbę:");
        int number = scanNumber.nextInt();
        ex02.primeNumbers2(number);
        System.out.println("Metoda Uli: ");
        System.out.println(met2.primeNumbers(number)?
                "Podana Liczba " + number + " jest liczba pierwszą": "Podana Liczba " + number + " nie jest liczba pierwszą");

    }
}

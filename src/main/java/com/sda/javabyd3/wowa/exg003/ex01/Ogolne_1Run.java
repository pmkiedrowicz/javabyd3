//Napisz program, który pobiera liczbę od użytkownika i sprawdza czy podana liczba
//jest parzysta lub nieparzysta i wyświetla stosowny komunikat.

package com.sda.javabyd3.wowa.exg003.ex01;

import java.util.Scanner;

public class Ogolne_1Run {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number (int) to check: ");
        int number = sc.nextInt();

        Ogolne_1 zad1 = new Ogolne_1();
        Boolean result = zad1.evenOrOdd(number);
        if (result) {
            System.out.println("number is even");
        } else {
            System.out.println("number is odd");
        }
        sc.close();
    }
}

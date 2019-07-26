package com.sda.javabyd3.mabr.zadania003;

import java.util.Scanner;

public class MainPrimeChecker {

    public static void main(String[] args) {

        Integer number;
        Scanner read = new Scanner(System.in);
        number = read.nextInt();

        PrimeChecker primeChecker = new PrimeChecker();

        if (new PrimeChecker().Prime(number)) {
            System.out.println("Podana liczba <" + number + "> jest liczbą pierwszą");

        } else {
            System.out.println("Podana liczba <" + number + "> nie jest liczbą pierwszą");
        }
    }
}

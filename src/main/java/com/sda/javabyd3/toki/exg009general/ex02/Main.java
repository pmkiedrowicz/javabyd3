package com.sda.javabyd3.toki.exg009general.ex02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Gimme integer: ");
        Integer number = scanner.nextInt();
        scanner.close();

        FindNearestPrime findNearestPrime = new FindNearestPrime();
        PrimeChecker primeChecker = new PrimeChecker();
        System.out.println("Is it prime? " + primeChecker.isPrime(number));
        if (primeChecker.isPrime(number) == true) {
        } else {
            System.out.println("Nearest prime: " + findNearestPrime.findPrime(number));
        }
    }
}

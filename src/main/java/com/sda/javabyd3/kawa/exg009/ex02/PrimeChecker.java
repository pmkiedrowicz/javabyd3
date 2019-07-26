package com.sda.javabyd3.kawa.exg009.ex02;

public class PrimeChecker {

    public boolean isPrime(int number) {
        boolean isPrime = true;
        for (int i = 2; i < number; i++) {
            if (number % i  == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
}

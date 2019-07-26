package com.sda.javabyd3.daol.exg009.ex02;

public class PrimeChecker {
    public boolean isPrime(Integer number) {
        boolean testInPrime = true;
        for (int i = 2; i < number; i++ ) {
            if (number % i == 0) {
                testInPrime = false;
                break;
            }
        }

        return testInPrime;
    }
}

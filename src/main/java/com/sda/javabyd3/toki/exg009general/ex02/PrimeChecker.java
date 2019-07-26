package com.sda.javabyd3.toki.exg009general.ex02;

public class PrimeChecker {
    public PrimeChecker() {
    }

    public boolean isPrime(int number) {
boolean testIsPrime=true;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                testIsPrime=false;
            }
        }

        return testIsPrime;
    }
}

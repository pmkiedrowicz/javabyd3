package com.sda.javabyd3.migr.exg009.ex02;

public class PrimeChecker {

    public boolean isPrime(Integer number) {
        boolean testIsPrime = true;
        for (int i = 2; i< number; i++){
            if (number %i == 0) {
                testIsPrime = false;
                break;
            }
        }
            return testIsPrime;
    }
}

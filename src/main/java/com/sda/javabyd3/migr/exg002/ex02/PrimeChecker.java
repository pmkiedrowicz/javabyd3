package com.sda.javabyd3.migr.exg002.ex02;

public class PrimeChecker {


    public boolean isPrime(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0)
                return true;
        }
        return false;
    }

}


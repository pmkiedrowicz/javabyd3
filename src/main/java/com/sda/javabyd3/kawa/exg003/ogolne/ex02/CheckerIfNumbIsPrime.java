package com.sda.javabyd3.kawa.exg003.ogolne.ex02;

public class CheckerIfNumbIsPrime {

    public boolean checkIfPrime(int arg) {
        for (int i = 2; i < arg; i++) {
            if (arg % i == 0) {
                return false;
            }
        }return true;
    }
}

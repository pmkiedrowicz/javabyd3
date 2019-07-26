package com.sda.javabyd3.urdu.exg009;

public class CheckPrimeNumbers {

    public boolean isPrime(int number) {

        if (number == 2 || number == 3) {
            return true;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}

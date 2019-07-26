package com.sda.javabyd3.jaja.exg009.ex02;

public class PrimeChecker {

    public boolean IsPrime(Integer number) {
        boolean isPrime = true;
        for (int i = 2; i< number; i++){
            if (number % i ==0){
                isPrime = false;
                break;
            }
        }return isPrime;
    }
}

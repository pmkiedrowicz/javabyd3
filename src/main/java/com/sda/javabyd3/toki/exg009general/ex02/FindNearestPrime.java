package com.sda.javabyd3.toki.exg009general.ex02;

public class FindNearestPrime {
    PrimeChecker primeCheck;

    public FindNearestPrime() {
        this.primeCheck = new PrimeChecker();
    }

    public Integer findPrime(Integer number) {
        Integer smallerPrime = findSmallerPrime(number);
        Integer greaterPrime = findGreaterPrime(number);

        if ((number-smallerPrime>=greaterPrime-number)){

        return greaterPrime;}else return smallerPrime;
    }

    private Integer findSmallerPrime(Integer number) {
        PrimeChecker primeCheck = new PrimeChecker();
        Integer primeNumber = 0;
        for (int i = number - 1; i > 2; i++) {
            if (primeCheck.isPrime(i)) {
                primeNumber = i;
                break;
            }
        }
        return primeNumber;
    }

    private Integer findGreaterPrime(Integer number) {
        PrimeChecker primeCheck = new PrimeChecker();
        Integer primeNumber = 0;
        for (int i = number + 1; i < Integer.MAX_VALUE; i++) {
            if (primeCheck.isPrime(i)) {
                primeNumber = i;
                break;
            }
        }
        return primeNumber;
    }
}


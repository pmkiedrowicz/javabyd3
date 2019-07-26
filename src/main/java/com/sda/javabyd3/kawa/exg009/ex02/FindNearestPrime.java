package com.sda.javabyd3.kawa.exg009.ex02;

public class FindNearestPrime {
    PrimeChecker primeChecker;

    public FindNearestPrime() {
        this.primeChecker = new PrimeChecker();
    }

    public Integer findPrime(Integer number) {
        Integer smallerPrime = findSmallerPrime(number);
        Integer greaterPrime = findGreaterPrime(number);

        if (number - smallerPrime >= greaterPrime - number){
            return greaterPrime;
        }else
            return smallerPrime;
    }

    public Integer findSmallerPrime(Integer number) {

        Integer primeNumber = 0;
        for (int i = number - 1; i > 2; i--) {
            if (primeChecker.isPrime(i)) {
                primeNumber = i;
                break;
            }
        }
        return primeNumber;
    }

    public Integer findGreaterPrime(Integer number) {
        Integer primeNumber = 0;
        for (int i = number + 1; i < Integer.MAX_VALUE; i++) {
            if (primeChecker.isPrime(i)) {
                primeNumber = i;
                break;
            }
        }
        return primeNumber;
    }
}

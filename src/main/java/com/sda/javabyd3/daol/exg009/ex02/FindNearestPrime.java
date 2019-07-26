package com.sda.javabyd3.daol.exg009.ex02;

public class FindNearestPrime {

    PrimeChecker primeChecker;

    public FindNearestPrime() {
        this.primeChecker = new PrimeChecker();
    }

    public Integer findPrime(Integer number) {
        Integer smallerPrime = findSmallerPrimeNumber(number);
        Integer greaterPrime = findGreaterPrimeNumber(number);
        if ((number - smallerPrime) >= (greaterPrime - number) == true) {
            return greaterPrime;
        } else {
            return smallerPrime;
        }
    }

        private Integer findSmallerPrimeNumber (Integer number){
            Integer primeNumber = 0;
            for (int i = number - 1; i > 2; i--) {
                if (primeChecker.isPrime(i)) {
                    primeNumber = i;
                    break;
                }
            }

            return primeNumber;
        }

        private Integer findGreaterPrimeNumber (Integer number){
            PrimeChecker primeChecker = new PrimeChecker();
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

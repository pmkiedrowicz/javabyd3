package com.sda.javabyd3.urdu.exg009.ex02;

import com.sda.javabyd3.urdu.exg009.CheckPrimeNumbers;

public class FindNearestPrime {
    CheckPrimeNumbers checkPrimeNumbers = new CheckPrimeNumbers();

    public Integer findPrime(Integer number){

       Integer smallerPrime = findSmallerPrime(number);
       Integer largerPrime = findLargerPrime(number);

            if((largerPrime - number <= (number - smallerPrime))){
                return largerPrime;
            } else return smallerPrime;
    }

    private Integer findSmallerPrime(Integer number){
        Integer result=0;
        for(int i=number-1;i>=2;i--){
            if(checkPrimeNumbers.isPrime(i)){
                result=i;
                break;
            }
        }
        return result;
    }

    private Integer findLargerPrime(Integer number){
        Integer result=0;
        for(int i=number+1;i<Integer.MAX_VALUE;i++){

            if(checkPrimeNumbers.isPrime(i)){
                result=i;
                break;
            }
        }
        return result;
    }

}

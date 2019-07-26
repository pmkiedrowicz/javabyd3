package com.sda.javabyd3.urdu.exg009.ex02;

import com.sda.javabyd3.urdu.exg009.CheckPrimeNumbers;

public class FirstPrime {
    CheckPrimeNumbers checkPrimeNumbers = new CheckPrimeNumbers();

    public Integer searchFirstPrime(Integer number){
      Integer prime=0;

            for(int i=1; (prime==0);i++){

                if(checkPrimeNumbers.isPrime(number+i)==true ){
                    prime=number+i;
                }
                else if (checkPrimeNumbers.isPrime(number-i)==true){
                    prime=number-i;
                }
            }
     return prime;
    }
}

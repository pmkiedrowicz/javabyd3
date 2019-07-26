//Napisz program, który po wpisaniu dowolnej liczby całkowitej (int) poda najbliższą
//liczbę pierwszą. W przypadku pojawienia się dwóch o tej samej bliskości, wybierze
//większą. np. 6 -> 7, a nie 5.

package com.sda.javabyd3.wowa.exg009.ex02;

public class FindNearestPrime
{
    PrimeChecker primeChecker;

    public FindNearestPrime()
    {
        this.primeChecker = new PrimeChecker();
    }

    public Integer findPrime(Integer number)
    {
        Integer smallerPrime = findSmallerPrime(number);
        Integer greaterPrime = findGreaterPrime(number);

        if(number - smallerPrime >= greaterPrime - number)
        {
            return greaterPrime;
        }
        else return smallerPrime;
    }

    private Integer findSmallerPrime (Integer number)
    {
       Integer primeNumber = 0;

        for (int i = number - 1; i > 2; i--)
        {
            if (primeChecker.isPrime(i))
            {
                primeNumber = i;
                break;
            }
        }
        return primeNumber;
    }

    private Integer findGreaterPrime (Integer number)
    {
        Integer primeNumber = 0;

        for (int i = number + 1; i < Integer.MAX_VALUE; i++)
        {
            if (primeChecker.isPrime(i))
            {
                primeNumber = i;
                break;
            }
        }
        return primeNumber;
    }
}

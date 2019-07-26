//Napisz program, który po wpisaniu dowolnej liczby całkowitej (int) poda najbliższą
//liczbę pierwszą. W przypadku pojawienia się dwóch o tej samej bliskości, wybierze
//większą. np. 6 -> 7, a nie 5.

package com.sda.javabyd3.wowa.exg009.ex02;

public class PrimeChecker
{
    public boolean isPrime(int number)
    {
        for (int i = 2; i < number; i++)
        {
            if (number%i == 0 )
                return false;
        }
        return true;
    }
}

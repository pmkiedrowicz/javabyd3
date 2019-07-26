//Napisz program, który po wpisaniu dowolnej liczby całkowitej (int) poda najbliższą
//liczbę pierwszą. W przypadku pojawienia się dwóch o tej samej bliskości, wybierze
//większą. np. 6 -> 7, a nie 5.

package com.sda.javabyd3.wowa.exg009.ex02;

import org.junit.Assert;
import org.junit.Test;

public class FindNearestPrimeTest
{

    @Test
    public void findPrimeWhenFindPrimaryNumberIsLargerThenProvided()
    {
        FindNearestPrime findNearestPrime = new FindNearestPrime();
        Integer number = 10;
        Integer expectedPrime = 11;
        Assert.assertEquals(expectedPrime, findNearestPrime.findPrime(number));
    }

    @Test
    public void findPrimeWhenFindPrimaryNumberIsSmallerThenProvided()
    {
        FindNearestPrime findNearestPrime = new FindNearestPrime();
        Integer number = 8;
        Integer expectedPrime = 7;
        Assert.assertEquals(expectedPrime, findNearestPrime.findPrime(number));
    }

    @Test
    public void findPrimeWhenFindPrimaryIsBigger()
    {
        FindNearestPrime findNearestPrime = new FindNearestPrime();
        Integer number = 12;
        Integer expectedPrime = 13;
        Assert.assertEquals(expectedPrime, findNearestPrime.findPrime(number));
    }

    @Test
    public void findPrime()
    {
    }
}
package com.sda.javabyd3.daol.exg009.ex02;

import org.junit.Assert;
import org.junit.Test;

public class FindNearestPrimeTest {

    @Test
    public void findPrimeWhenPrimeNumberIsLargerThenProvided() {
        FindNearestPrime findNearestPrime = new FindNearestPrime();
        Integer number = 10;
        Integer expectedPrime = 11;
        Assert.assertEquals(expectedPrime, findNearestPrime.findPrime(number));
    }

    @Test
    public void findPrimeWhenPrimeNumberIsSmallerThenProvided() {
        FindNearestPrime findNearestPrime = new FindNearestPrime();
        Integer number = 8;
        Integer expectedPrime = 7;
        Assert.assertEquals(expectedPrime, findNearestPrime.findPrime(number));
    }

    @Test
    public void findPrimeWhenPrimeNumerIsBigger() {
        FindNearestPrime findNearestPrime = new FindNearestPrime();
        Integer number = 12;
        Integer expectedPrime = 13;
        Assert.assertEquals(expectedPrime, findNearestPrime.findPrime(number));
    }
}


package com.sda.javabyd3.toki.exg009general.ex02;

import org.junit.Assert;
import org.junit.Test;

public class FindNearestPrimeTest {
    FindNearestPrime findNearestPrime = new FindNearestPrime();

    @Test
    public void findPrimeWhenFindNumberIsLargerThanProvider() {
        Integer number = 10;
        Integer expectedPrime = 11;
        Assert.assertEquals(expectedPrime, findNearestPrime.findPrime(number));
    }

    @Test
    public void findPrimeWhenNumberIsSmallerThanProvided() {
        Integer number = 8;
        Integer expectedPrime = 7;
        Assert.assertEquals(expectedPrime, findNearestPrime.findPrime(number));
    }

    @Test
    public void returnsGreaterPrimeNumberWhenGotTwoOnSameRange() {
        Integer number = 12;
        Integer expectedValue = 13;
        Assert.assertEquals(expectedValue, findNearestPrime.findPrime(number));
    }
}
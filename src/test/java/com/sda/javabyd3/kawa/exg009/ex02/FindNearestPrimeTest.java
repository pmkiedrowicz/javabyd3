package com.sda.javabyd3.kawa.exg009.ex02;

import org.junit.Assert;
import org.junit.Test;

public class FindNearestPrimeTest {

    FindNearestPrime test = new FindNearestPrime();

    @Test
    public void findPrimeWhenFindPrimaryNumberIsLargerThanProvded() {
        Integer number = 10;
        Integer expectedPrime = 11;
        Assert.assertEquals(expectedPrime, test.findPrime(number));
    }

    @Test
    public void findPrimeWhenFindPrimaryNumberIsSmalerThanProvded() {
        Integer number = 8;
        Integer expectedPrime = 7;
        Assert.assertEquals(expectedPrime, test.findPrime(number));
    }

    @Test
    public void findPrimeWhenFindPrimaryIsBigger (){
        Integer number = 12;
        Integer expectedPrime = 13;
        Assert.assertEquals(expectedPrime, test.findPrime(number));
    }
}
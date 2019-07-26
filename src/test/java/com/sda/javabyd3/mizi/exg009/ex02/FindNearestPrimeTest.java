package com.sda.javabyd3.mizi.exg009.ex02;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindNearestPrimeTest {


    @Test
    public void findPrimeWhenFindPrimaryNumberyIsLargerThenProvided() {
        FindNearestPrime findNearestPrime = new FindNearestPrime();
        Integer number = 10;
        Integer expectedPrime = 11;
        Assert.assertEquals(expectedPrime, findNearestPrime.findPrime(number));
    }

    @Test
    public void findPrimeWhenFindPrimaryNumberIsSmallerThenProvided(){
        FindNearestPrime findNearestPrime = new FindNearestPrime();
        Integer number = 8;
        Integer expectedPrime = 7;
        Assert.assertEquals(expectedPrime, findNearestPrime.findPrime(number));
    }

    @Test
    public void findPrimeWhenFindPrimaryIsBigger(){
        FindNearestPrime findNearestPrime = new FindNearestPrime();
        Integer number = 12;
        Integer expectedPrime = 13;
        Assert.assertEquals(expectedPrime, findNearestPrime.findPrime(number));
    }

}
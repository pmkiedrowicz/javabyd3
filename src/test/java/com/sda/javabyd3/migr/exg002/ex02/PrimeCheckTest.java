package com.sda.javabyd3.migr.exg002.ex02;

import org.junit.Assert;
import org.junit.Test;

public class PrimeCheckTest {

    PrimeChecker numTest = new PrimeChecker();

    @Test
    public void primeCheckTest() {

        Assert.assertTrue("method primeCheck does not work correctly", numTest.isPrime(6) == true);
        Assert.assertTrue("method primeCheck does not work correctly", numTest.isPrime(7) == false);

    }
}

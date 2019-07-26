package com.sda.javabyd3.toki.exg009general.ex02;

import org.junit.Assert;
import org.junit.Test;

public class PrimeCheckerTest {
    PrimeChecker primeChecker = new PrimeChecker();

    @Test
    public void checkNumberForPrime() {
        Integer correctNumber = 7;
        Assert.assertTrue("Return true if number is prime", primeChecker.isPrime(correctNumber));
    }
}
package com.sda.javabyd3.daol.exg009.ex02;

import org.junit.Assert;
import org.junit.Test;

public class PrimeCheckerTest {

    @Test
    public void checkNumberIsPrime() {
        PrimeChecker primeChecker = new PrimeChecker();
        Integer correctNumber = 7;
        Assert.assertTrue("Return true if number is prime",
                primeChecker.isPrime(correctNumber));
    }

    @Test
    public void checkNumerIsntPrime() {
        PrimeChecker primeChecker = new PrimeChecker();
        Integer incorrectNumer = 9;
        Assert.assertFalse("Return true if number is prime",
                primeChecker.isPrime(incorrectNumer));
    }
}

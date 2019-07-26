package com.sda.javabyd3.mizi.exg009.ex02;

import org.junit.Assert;
import org.junit.Test;

public class PrimeCheckerTest {

    @Test
    public void checkNumberIsPrime() {
        PrimeChecker primeChecker = new PrimeChecker();
        Integer correctNumber = 7;
        Assert.assertTrue("Return true if number is prime",
               primeChecker.isPrime(correctNumber) );
    }

    @Test
    public void checkNumberIsntPrime() {
        PrimeChecker primeChecker = new PrimeChecker();
        Integer incorrectNumber = 9;
        Assert.assertFalse("Return true if number isn't prime",
                primeChecker.isPrime(incorrectNumber) );
    }
}
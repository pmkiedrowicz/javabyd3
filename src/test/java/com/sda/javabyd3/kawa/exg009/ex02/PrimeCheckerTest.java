package com.sda.javabyd3.kawa.exg009.ex02;

import org.junit.Assert;
import org.junit.Test;

public class PrimeCheckerTest {

    PrimeChecker test = new PrimeChecker();

    @Test
    public void checkNumberIsPrime() {
        Integer correctNumber = 7;
        Assert.assertTrue("Return number if number is prime", test.isPrime(correctNumber));
    }

    @Test
    public void checkNumberIsntPrime() {
        Integer incorrectNumber = 9;
        Assert.assertFalse("Return number if number isnt prime", test.isPrime(incorrectNumber));
    }
}
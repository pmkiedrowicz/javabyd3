package com.sda.javabyd3.migr.exg009.ex02;


import org.junit.Assert;
import org.junit.Test;

public class PrimeCheckerTest {

   PrimeChecker primeChecker = new PrimeChecker();

    @Test
    public void checkNumberIsPrime() {

        Integer correctNumber = 7;

        Assert.assertTrue("Return true if number is prime", primeChecker.isPrime(correctNumber));
    }

    @Test
    public void checkNumberIsntPrime(){
        Integer incorrectNumber = 9;
        Assert.assertTrue("return true if number isnt prime", !primeChecker.isPrime(incorrectNumber));
    }
}
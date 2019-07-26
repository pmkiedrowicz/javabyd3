package com.sda.javabyd3.daol.exg003.ex02;

import org.junit.Assert;
import org.junit.Test;

public class PrimeCheckerTest {

@Test
   public void primeNumber () {
    PrimeChecker primeChecker = new PrimeChecker();
    Boolean result = primeChecker.primeNumbers(5);
    Assert.assertTrue(result);
}
@Test
    public void notPrimeNumer () {
    PrimeChecker primeChecker = new PrimeChecker();
    Boolean result = primeChecker.primeNumbers(4);
    Assert.assertFalse(result);
}
}

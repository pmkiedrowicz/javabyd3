package com.sda.javabyd3.syga.exg003.ex02;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PrimeNumberTest {

    @Test
    public void shouldCheckIfTheNumberIsPrimeNumber() {
        PrimeNumber primeNumber = new PrimeNumber();
        Boolean result = primeNumber.CheckNumber(7);
        Assert.assertTrue("PrimeNumber does not work correctly. Expercterd true but was " + result, result == true);
    }

}
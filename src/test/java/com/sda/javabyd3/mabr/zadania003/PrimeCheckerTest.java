package com.sda.javabyd3.mabr.zadania003;

import org.junit.Assert;
import org.junit.Test;

public class PrimeCheckerTest {

    @Test
    public void Prime() {
        PrimeChecker primeChecker = new PrimeChecker();
        Boolean result = primeChecker.Prime(7);
        Assert.assertTrue(result);
    }
}

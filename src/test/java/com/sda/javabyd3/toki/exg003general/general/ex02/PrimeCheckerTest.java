package com.sda.javabyd3.toki.exg003general.general.ex02;

import junit.framework.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class PrimeCheckerTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void shouldCheckIfTheNumberIsPrimeChecker() {
        PrimeChecker primeNumber = new PrimeChecker();
        Boolean result = primeNumber.number(7);
        Assert.assertTrue("PrimeChecker does not work correctly. Expected true but was " + result, result == false);
    }
}
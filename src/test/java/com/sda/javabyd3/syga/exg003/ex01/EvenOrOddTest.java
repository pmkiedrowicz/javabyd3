package com.sda.javabyd3.syga.exg003.ex01;

import com.sda.javabyd3.syga.exg003.ex02.PrimeNumber;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class EvenOrOddTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void shouldCheckIfTheNumberIsEvenOrOdd() {
        EvenOrOdd evenOrOdd = new EvenOrOdd();
        Boolean result = evenOrOdd.check(4);
        Assert.assertTrue("EvenOrOdd does not work correctly. Expected true but was " + result , result == true);
    }



}

package com.sda.javabyd3.mabr.zadania003;

import org.junit.Assert;
import org.junit.Test;

public class EvenOddTest {

    @Test
    public void Check() {
        EvenOdd evenOdd = new EvenOdd();
        Boolean result = evenOdd.Check(4);
        Assert.assertTrue(result);
    }
}

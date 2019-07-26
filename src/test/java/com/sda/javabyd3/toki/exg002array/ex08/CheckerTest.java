package com.sda.javabyd3.toki.exg002array.ex08;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckerTest {
    Checker checker = new Checker();

    @Test
    public void checkArray() {
        int[] arrayForTrue = {4, 5, 6};
        int[] arrayForFalse = {8, 4, 6};

        Assert.assertTrue(checker.checkArray(arrayForTrue));
        Assert.assertFalse(checker.checkArray(arrayForFalse));
    }
}
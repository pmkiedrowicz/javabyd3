package com.sda.javabyd3.mabr.zadania002;//package Zad002;

import org.junit.Assert;
import org.junit.Test;

public class Zad8Test {
    @Test
    public void testOfZad8() {
        Zad8 zad8 = new Zad8();
        int[] arrayTrue = {1, 2, 3, 3, 3};
        int[] arrayFalse = {1, 2, 3, 5, 3};
        int[] arrayToShort = {1, 2};
        Assert.assertTrue("check that 3 posiotions are the same", zad8.checkArray(arrayTrue));
        Assert.assertFalse("Check to short table", zad8.checkArray(arrayToShort));
        Assert.assertFalse("check table without correlation", zad8.checkArray(arrayFalse));
    }
}

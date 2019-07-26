package com.sda.javabyd3.mabr.zadania002;

import org.junit.Assert;
import org.junit.Test;

public class Zad7Test {

    @Test
    public void checkZad7Method() {
        Zad7 zad7 = new Zad7();
        int[] array = {1, 2, 3, 4, 5, 6};
        Assert.assertTrue("Evens are greater" == zad7.checkSumInTable(array));
    }
}

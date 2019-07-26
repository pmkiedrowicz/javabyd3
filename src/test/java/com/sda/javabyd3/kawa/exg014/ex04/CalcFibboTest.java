package com.sda.javabyd3.kawa.exg014.ex04;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalcFibboTest {

    CalcFibbo test = new CalcFibbo();

    @Test
    public void calculatinFibboWithRecursion() {
        int inNumber = 13;
        int result = 233;
        Assert.assertEquals(result, test.calculatinFibboWithRecursion(inNumber));
    }

    @Test
    public void callculatinFibboWithoutRecursion() {
        int inNumber = 13;
        int result = 233;
        Assert.assertEquals(result, test.callculatinFibboWithoutRecursion(inNumber));
    }
}
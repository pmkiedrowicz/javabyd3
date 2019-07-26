package com.sda.javabyd3.kawa.exg009.ex01;

import org.junit.Assert;
import org.junit.Test;

public class NumberConverterTest {

    NumberConverter test = new NumberConverter();

    @Test
    public void converToStringBetweenTenAndTwenty() {
        Assert.assertEquals("siedemnascie", test.converToString(17));
    }

    @Test
    public void convertToStringLessThanTen() {
        Assert.assertEquals("siedem", test.converToString(7));
    }

    @Test
    public void convertToStringGreaterThanTwenty() {
        Assert.assertEquals("trzydziesci osiem", test.converToString(38));
    }
}
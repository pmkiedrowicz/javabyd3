package com.sda.javabyd3.toki.exg009general.ex01;

import org.junit.Assert;
import org.junit.Test;

public class NumberConverterTest {
    private NumberConverter numberConverter = new NumberConverter();

    @Test
    public void convertToStringLessThanTen() {
        String convertToString = numberConverter.convertToString(7);
        Assert.assertEquals("siedem", convertToString);
    }

    @Test
    public void convertToStringBetweenTenAnTwenty() {
        String convertToString = numberConverter.convertToString(17);
        Assert.assertEquals("siedemnascie", convertToString);
    }

    @Test
    public void convertToStringGreaterThanTwenty() {
        String convertToString = numberConverter.convertToString(38);
        Assert.assertEquals("trzydziesci osiem", convertToString);
    }
}
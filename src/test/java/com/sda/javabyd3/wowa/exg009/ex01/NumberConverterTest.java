package com.sda.javabyd3.wowa.exg009.ex01;

import org.junit.Assert;
import org.junit.Test;

public class NumberConverterTest {

    private NumberConverter numberConverter = new NumberConverter();

    @Test
    public void convertToStringBetweenTenAndTwenty() {
        String numberAsText = numberConverter.convertToString(17);
        Assert.assertEquals("siedemnaście", numberAsText);
    }

    @Test
    public void convertToStringLessThanTen() {
        String numberAsText = numberConverter.convertToString(7);
        Assert.assertEquals("siedem", numberAsText);
    }

    @Test
    public void convertToStringGreaterThanTwenty() {
        String numberAsText = numberConverter.convertToString(38);
        Assert.assertEquals("trzydzieści osiem", numberAsText);
    }

}
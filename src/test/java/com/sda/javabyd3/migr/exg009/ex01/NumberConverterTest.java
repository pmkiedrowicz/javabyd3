package com.sda.javabyd3.migr.exg009.ex01;

import org.junit.Assert;
import org.junit.Test;

public class NumberConverterTest {
    NumberConverter numberConverter = new NumberConverter();
    @Test
    public void convertToStringBetweenTenAndTwenty() {


        Integer numberToConvert = 17;
        String convertedNumber = "siedemnaście";
        String convertToString = numberConverter.convertToString(numberToConvert);
        Assert.assertEquals(convertedNumber, convertToString);
    }

    @Test
    public void convertToStringLessThanTen() {
        String numberAsText = numberConverter.convertToString(7);
        Assert.assertEquals("siedem", numberAsText);
    }

    @Test
    public void convertTotringGreaterThanTwenty() {
        String numberAsText = numberConverter.convertToString(38);
        Assert.assertEquals("trzydzieści osiem", numberAsText);
    }
}
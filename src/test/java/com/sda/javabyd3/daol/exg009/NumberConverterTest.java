package com.sda.javabyd3.daol.exg009;

import com.sda.javabyd3.daol.exg009.ex01.NumberConverter;
import org.junit.Assert;
import org.junit.Test;

public class NumberConverterTest {
    NumberConverter numberConverter = new NumberConverter();

    @Test
    public void convertToStringLessThanTen() {
        String numberAsText = numberConverter.convertToString(7);
        Assert.assertEquals("siedem", numberAsText);
    }

    @Test
    public void convertToStringBetweenTenAndTwenty() {
        String numberAsText = numberConverter.convertToString(17);
        Assert.assertEquals("siedemnaście", numberAsText);
    }

    @Test
    public void convertToStringGreaterThanTwenty() {
        String numberAsText = numberConverter.convertToString(38);
        Assert.assertEquals("trzydzieści osiem", numberAsText);
    }

    @Test
    public void convertToString20(){
        String numberAsText = numberConverter.convertToString(20);
        Assert.assertEquals("dwadzieścia", numberAsText);
    }
}
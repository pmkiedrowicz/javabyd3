package com.sda.javabyd3.mizi.exg009.ex01;

import com.sda.javabyd3.mizi.exg009.ex01.NumberConverter;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Michal Ziolecki.
 */
public class NumberConverterTest {

    private NumberConverter numberConverter = new NumberConverter();

    @Test
    public void convertToStringLessThanTen()
    {
        String numbersAsText = numberConverter.convertToString( 7 );
        Assert.assertEquals( "siedem",numbersAsText);
    }

    @Test
    public void convertToStringBetweenTenAndTwenty() throws Exception {
        Integer numberToConvert = 17;
        String convertedNumber = "siedemnaście";
        String numbersAsText = numberConverter.convertToString( numberToConvert );
        Assert.assertEquals( convertedNumber,numbersAsText);

    }

    @Test
    public void convertToStringGreaterThanTwenty()
    {
        String numbersAsText = numberConverter.convertToString( 38);
        Assert.assertEquals( "trzydzieści osiem",numbersAsText);
    }
}
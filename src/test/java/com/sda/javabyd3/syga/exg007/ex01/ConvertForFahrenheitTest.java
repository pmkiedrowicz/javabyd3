package com.sda.javabyd3.syga.exg007.ex01;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConvertForFahrenheitTest {
    ConvertForFahrenheit convertForFahrenheit = new ConvertForFahrenheit();
    @Test
    public void schouldConvertCelsiusForFahrenheit(){
        double temp = 100;
        double result = convertForFahrenheit.convertForFahrenheit(temp);
        Assert.assertTrue("Convert does not work correctly. Expercterd 212.0 but was " + result, result==212.0);
    }

}
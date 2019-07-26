package com.sda.javabyd3.syga.exg007.ex01;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConvertForCelsiusTest {
    ConvertForCelsius convertForCelsius = new ConvertForCelsius();

    @Test
    public void shouldConvertFahrenheitForCelsius(){
        double temp = 212;
        double result = convertForCelsius.convertForCelsius(temp);
        Assert.assertTrue("Convert does not work correctly. Expercterd 100.0 but was " + result, result==100.0);
    }

}
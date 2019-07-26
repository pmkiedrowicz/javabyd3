package com.sda.javabyd3.kawa.exg007.ex01;

import org.junit.Assert;
import org.junit.Test;

public class TemperatureConverterTest {

    TemperatureConverter test = new TemperatureConverter();

    @Test
    public void convertingCtoF() {
        Assert.assertTrue("error",test.convertingCtoF(12)== 53.6);
    }

    @Test
    public void convertingFtoC() {
        Assert.assertTrue("error2", test.convertingFtoC(9)==(-12.777777777777779));
    }
}
package com.sda.javabyd3.mabr.zadania007;

import org.junit.Assert;
import org.junit.Test;

public class ConverterTest {

    @Test
    public void celciusToFehrenheit() throws Exception {
        Converter converter = new Converter();
        Assert.assertEquals(68.00, converter.celciusToFehrenheit(20.0), 0.01);
    }

    @Test
    public void fehrenheitToCelcius() throws Exception {
        Converter converter = new Converter();
        Assert.assertEquals(20.00, converter.fehrenheitToCelcius(68.0), 0.01);
    }
}
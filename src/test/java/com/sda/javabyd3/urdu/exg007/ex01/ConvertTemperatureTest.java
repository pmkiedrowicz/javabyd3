package com.sda.javabyd3.urdu.exg007.ex01;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConvertTemperatureTest {

    @Test
    public void convertToFahrenheit() {
        ConvertTemperature convertTemperature = new ConvertTemperature();
        Assert.assertTrue(convertTemperature.convertToFahrenheit(10)==50.0);

    }

    @Test
    public void convertToCelcius() {
        ConvertTemperature convertTemperature = new ConvertTemperature();
        Assert.assertTrue(convertTemperature.convertToCelcius(122)==50.0);
    }
}
package com.sda.javabyd3.toki.exg007oop.ex01;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ConverterToFahrenheitTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void expectingFahrenheitValue() {
ConverterToFahrenheit converterToFahrenheit=new ConverterToFahrenheit();
        double tempToConvert = 26;
        double resultToCheck = 78.8;
        Assert.assertEquals("Convert to Celsius does not work correctly. Expected '78.8' but got: " + converterToFahrenheit, resultToCheck,converterToFahrenheit.convertItToFahrenheit(tempToConvert),0);
    }
}
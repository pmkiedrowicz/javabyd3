package com.sda.javabyd3.toki.exg007oop.ex01;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ConverterToCelsiusTest {
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void expectingCelsiusValue() {
        ConverterToCelsius converterToCelsius = new ConverterToCelsius();
        double tempToConvert = 26;
        double resultToCheck = -3.3333333333333335;
        Assert.assertEquals("Convert to Celsius does not work correctly. Expected '-3.3333333333333335' but got: " + converterToCelsius, resultToCheck,converterToCelsius.convertItToCelsius(tempToConvert),0);
    }
}
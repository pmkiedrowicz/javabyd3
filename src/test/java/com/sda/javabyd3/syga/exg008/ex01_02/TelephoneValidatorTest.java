package com.sda.javabyd3.syga.exg008.ex01_02;

import org.junit.Assert;
import org.junit.Test;

public class TelephoneValidatorTest {

    @Test
    public void validate() {
        TelephoneValidator telephoneValidator = new TelephoneValidator();
        String number1 = "123 456 789";
        String number2 = "123456789";
        String number3 = "123-456-789";
        String number4 = "+48123456789";
        String number5 = "+48 123 456 789";
        String number6 = "+48 123-456-789";

        Assert.assertTrue(number1, telephoneValidator.validate(number1));
        Assert.assertTrue(number2, telephoneValidator.validate(number2));
        Assert.assertTrue(number3, telephoneValidator.validate(number3));
        Assert.assertTrue(number4, telephoneValidator.validate(number4));
        Assert.assertTrue(number5, telephoneValidator.validate(number5));
        Assert.assertTrue(number6, telephoneValidator.validate(number6));
    }
}
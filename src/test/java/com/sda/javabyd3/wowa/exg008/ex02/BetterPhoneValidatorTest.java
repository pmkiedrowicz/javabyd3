package com.sda.javabyd3.wowa.exg008.ex02;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;

public class BetterPhoneValidatorTest {
    BetterPhoneValidator bv = new BetterPhoneValidator();

    @Test
    public void allNumbersValidator() {
        boolean result = bv.validate("123456789");
        Assert.assertThat(result, is(true));
    }

    @Test
    public void numbersWithDashesValidator() {
        boolean result = bv.validate("123-456-789");
        Assert.assertThat(result, is(true));
    }

    @Test
    public void numbersWithSpacesValidator() {
        boolean result = bv.validate("123 456 789");
        Assert.assertThat(result, is(true));
    }

    @Test
    public void internNumbersValidator() {
        boolean result = bv.validate("+43123456789");
        Assert.assertThat(result, is(true));
    }

    @Test
    public void internNumbersWithDashesValidator() {
        boolean result = bv.validate("+46123-456-789");
        Assert.assertThat(result, is(true));
    }

    @Test
    public void internNumbersWithSpacesValidator() {
        boolean result = bv.validate("+46123 456 789");
        Assert.assertThat(result, is(true));
    }
}

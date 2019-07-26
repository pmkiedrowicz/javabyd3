package com.sda.javabyd3.wowa.exg008.ex01;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;

public class TelephoneValidatorTest {
    TelephoneValidator tv = new TelephoneValidator();

    @Test
    public void isPhoneNumberCorrect() {
        boolean result = tv.validate("123456789");
        Assert.assertThat(result, is(true));
    }

    @Test
    public void isPhoneNumberWithSpacesCorrect() {
        boolean result = tv.validate("123 456 789");
        Assert.assertThat(result, is(true));
    }

    @Test
    public void isPhoneNumberWithDashesCorrect() {
        boolean result = tv.validate("123-456-789");
        Assert.assertThat(result, is(true));
    }
}

package com.sda.javabyd3.urdu.exg008regex.ex01;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ValidatorTest {
    Validator validator = new Validator();

    @Test
    public void checkPhoneNumberWithoutSpace() {

        Assert.assertTrue(validator.checkPhoneNumber("883883883"));
        Assert.assertFalse(validator.checkPhoneNumber("88388388"));
    }
    @Test
    public void checkPhoneNumberWithSpace() {

        Assert.assertTrue(validator.checkPhoneNumber("883 883 883"));
        Assert.assertFalse(validator.checkPhoneNumber("88 33 88 33 888"));
    }

    @Test
    public void checkPhoneNumberWithDash() {

        Assert.assertTrue(validator.checkPhoneNumber("883-883-883"));

    }
}
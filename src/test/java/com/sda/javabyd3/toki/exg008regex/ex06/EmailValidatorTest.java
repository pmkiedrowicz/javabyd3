package com.sda.javabyd3.toki.exg008regex.ex06;

import org.junit.Assert;
import org.junit.Test;

public class EmailValidatorTest {
    EmailValidator emailValidator = new EmailValidator();

    @Test
    public void validate() {
        String emailForTrue = "prettyandsimple@example.com";
        String emailForTrue2 = "very.common@example.com";
        String emailForTrue3 = "disposable.style.email.with+symbol@example.com";
        String emailForTrue4 = "other.email-with-dash@example.com";

        Assert.assertTrue(emailValidator.validate(emailForTrue));
        Assert.assertTrue(emailValidator.validate(emailForTrue2));
        Assert.assertTrue(emailValidator.validate(emailForTrue3));
        Assert.assertTrue(emailValidator.validate(emailForTrue4));

        String emailForFalse = "john.doe@example..com";
        String emailForFalse2 = "Abc.example.com";
        String emailForFalse3 = "just\"not\"right@example.com";
        String emailForFalse4 = "john..doe@example.com";

        Assert.assertFalse(emailValidator.validate(emailForFalse));
        Assert.assertFalse(emailValidator.validate(emailForFalse2));
        Assert.assertFalse(emailValidator.validate(emailForFalse3));
        Assert.assertFalse(emailValidator.validate(emailForFalse4));
    }
}
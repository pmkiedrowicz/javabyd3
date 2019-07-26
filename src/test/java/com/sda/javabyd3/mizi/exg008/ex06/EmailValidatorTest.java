package com.sda.javabyd3.mizi.exg008.ex06;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Michal Ziolecki.
 */
public class EmailValidatorTest {
    @Test
    public void validate() throws Exception {
        EmailValidator emailValidator = new EmailValidator();
        Assert.assertTrue( emailValidator.validate( "prettyandsimple@example.com" ) );
        Assert.assertTrue( emailValidator.validate( "very.common@example.com" ) );
        Assert.assertTrue( emailValidator.validate( "disposable.style.email.with+symbol@example.com" ) );
        Assert.assertTrue( emailValidator.validate( "other.email-with-dash@example.com" ) );
        Assert.assertFalse( emailValidator.validate( "john.doe@example..com" ) );
        Assert.assertFalse( emailValidator.validate( "Abc.example.com" ) );
        Assert.assertFalse( emailValidator.validate( "just\"not\"right@example.com" ) );
        Assert.assertFalse( emailValidator.validate( "john..doe@example.com" ) );

    }

}
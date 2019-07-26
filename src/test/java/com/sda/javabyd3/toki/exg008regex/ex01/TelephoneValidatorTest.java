package com.sda.javabyd3.toki.exg008regex.ex01;

import org.junit.Assert;
import org.junit.Test;

public class TelephoneValidatorTest {
        TelephoneValidator telephoneValidator=new TelephoneValidator();

    @Test
    public void validatetel1Number() {
        String tel1="555555555";
        Assert.assertTrue(tel1,telephoneValidator.validate(tel1));
    }

    @Test
            public void validatetel2Number(){
        String tel2="555 555 555";
        Assert.assertTrue(tel2,telephoneValidator.validate(tel2));
    }

    @Test
            public void validatetel3Number(){
        String tel3="555-555-555";
        Assert.assertTrue(tel3,telephoneValidator.validate(tel3));
    }

    @Test
            public void validatetel4Number(){
        String tel4="55 55 55 55 5";
        Assert.assertFalse(tel4, telephoneValidator.validate(tel4));
    }

    @Test
            public void validatetel5Number(){
        String tel5="5555555";
        Assert.assertFalse(tel5, telephoneValidator.validate(tel5));
    }

    @Test
            public void validatetel6Number(){
        String tel6="55555555555";
        Assert.assertFalse(tel6, telephoneValidator.validate(tel6));
    }
}
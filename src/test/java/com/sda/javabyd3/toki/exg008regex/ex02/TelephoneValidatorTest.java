package com.sda.javabyd3.toki.exg008regex.ex02;

import org.junit.Assert;
import org.junit.Test;

public class TelephoneValidatorTest {
    TelephoneValidator telephoneValidator = new TelephoneValidator();

    @Test
    public void validatetel11Number() {
        String tel1 = "555555555";
        Assert.assertTrue(tel1, telephoneValidator.validate(tel1));
    }

    @Test
    public void validatetel22Number() {
        String tel2 = "555 555 555";
        Assert.assertTrue(tel2, telephoneValidator.validate(tel2));
    }

    @Test
    public void validatetel33Number() {
        String tel3 = "555-555-555";
        Assert.assertTrue(tel3, telephoneValidator.validate(tel3));
    }

    @Test
    public void validatetel44Number() {
        String tel4 = "55 55 55 55 5";
        Assert.assertFalse(tel4, telephoneValidator.validate(tel4));
    }

    @Test
    public void validatetel55Number() {
        String tel5 = "5555555";
        Assert.assertFalse(tel5, telephoneValidator.validate(tel5));
    }

    @Test
    public void validatetel66Number() {
        String tel6 = "55555555555";
        Assert.assertFalse(tel6, telephoneValidator.validate(tel6));
    }

    @Test
    public void validatetel111Number() {
        String tel1 = "+48555555555";
        Assert.assertTrue(tel1, telephoneValidator.validate(tel1));
    }

    @Test
    public void validatetel222Number() {
        String tel2 = "+48555 555 555";
        Assert.assertTrue(tel2, telephoneValidator.validate(tel2));
    }

    @Test
    public void validatetel333Number() {
        String tel3 = "+48555-555-555";
        Assert.assertTrue(tel3, telephoneValidator.validate(tel3));
    }

    @Test
    public void validatetel444Number() {
        String tel4 = "+4855 55 55 55 5";
        Assert.assertFalse(tel4, telephoneValidator.validate(tel4));
    }

    @Test
    public void validatetel555Number() {
        String tel5 = "+485555555";
        Assert.assertFalse(tel5, telephoneValidator.validate(tel5));
    }

    @Test
    public void validatetel666Number() {
        String tel6 = "+4855555555555";
        Assert.assertFalse(tel6, telephoneValidator.validate(tel6));
    }
}
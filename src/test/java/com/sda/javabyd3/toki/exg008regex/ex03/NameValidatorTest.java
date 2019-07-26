package com.sda.javabyd3.toki.exg008regex.ex03;

import org.junit.Assert;
import org.junit.Test;

public class NameValidatorTest {
NameValidator nameValidator=new NameValidator();

    @Test
    public void validateName() {
        String name="Jan";
        String name2="Monika";
        String name3="Krzysztof";
        Assert.assertTrue(name, nameValidator.validate(name));
        Assert.assertTrue(name2, nameValidator.validate(name2));
        Assert.assertTrue(name3,nameValidator.validate(name3));
    }

    @Test
    public void validateName2(){
        String name="jan";
        String name2="monika";
        String name3="jan87";
        String name4="Jan87";
        Assert.assertFalse(name, nameValidator.validate(name));
        Assert.assertFalse(name2, nameValidator.validate(name2));
        Assert.assertFalse(name3, nameValidator.validate(name3));
        Assert.assertFalse(name4, nameValidator.validate(name4));
    }
}
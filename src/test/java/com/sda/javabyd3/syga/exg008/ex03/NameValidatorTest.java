package com.sda.javabyd3.syga.exg008.ex03;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class NameValidatorTest {
    NameValidator nameValidator = new NameValidator();

    @Test
    public void nameIsTrue(){
        String name = "Jan";
        Assert.assertTrue(name, nameValidator.nameValidator(name));
    }
    @Test
    public void nameIsFalse(){
        String name1 = "jan";
        String name2 = "Jan23";
        String name3 = "jan87";
        String name4 = "4Jan";
        Assert.assertFalse(name1, nameValidator.nameValidator(name1));
        Assert.assertFalse(name2, nameValidator.nameValidator(name2));
        Assert.assertFalse(name3, nameValidator.nameValidator(name3));
        Assert.assertFalse(name4, nameValidator.nameValidator(name4));
    }

}
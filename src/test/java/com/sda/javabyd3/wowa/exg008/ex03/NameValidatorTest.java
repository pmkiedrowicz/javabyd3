package com.sda.javabyd3.wowa.exg008.ex03;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;

public class NameValidatorTest {
    NameValidator nv = new NameValidator();

    @Test
    public void isNameCorrect() {
        boolean result1 = nv.validate("Wojtek");
        boolean result2 = nv.validate("Karolina");

        Assert.assertThat(result1, is(true));
        Assert.assertThat(result2, is(true));
    }

    @Test
    public void isNameIncorrect() {
        String name1 = ("wojtek");
        String name2 = ("Karolina6");

        Assert.assertFalse(name1, nv.validate(name1));
        Assert.assertFalse(name2, nv.validate(name2));
    }
}

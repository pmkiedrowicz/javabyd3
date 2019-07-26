package com.sda.javabyd3.kawa.exg003.ogolne.ex4;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class LetterConverterTest {

    LetterConverter test = new LetterConverter();

    @Test
    public void convertingSomeLetters() {
        Assert.assertNotEquals("error", test.convertingSomeLetters("Zażółć gęślą jaźń").equals("Zażółć gęślą jaźń"));
    }
}
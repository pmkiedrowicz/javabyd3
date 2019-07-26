package com.sda.javabyd3.daol.exg003.ex04;

import org.junit.Assert;
import org.junit.Test;

public class DiacriticWordTest {

    @Test
    public void notPolishcharLowerCase() {
        DiacriticWord diacriticWord = new DiacriticWord();
        String result = diacriticWord.toEngCharacters("żółw");
        Assert.assertTrue(result.equals("zolw"));
    }
    @Test
    public void notPolishCharUpperCase() {
        DiacriticWord diacriticWord = new DiacriticWord();
        String result = diacriticWord.toEngCharacters("ŻÓŁW");
        Assert.assertTrue(result.equals("ZOLW"));
    }
}

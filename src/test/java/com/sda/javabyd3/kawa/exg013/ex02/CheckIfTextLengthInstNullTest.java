package com.sda.javabyd3.kawa.exg013.ex02;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckIfTextLengthInstNullTest {

    CheckIfTextLengthInstNull test = new CheckIfTextLengthInstNull();

    @Test
    public void checkingIfTextLengthIsntNull() {
        String word = "Sprawdz";
        Assert.assertEquals(word.length(),test.checkingIfTextLengthIsntNull(word));
        Assert.assertEquals(-1,test.checkingIfTextLengthIsntNull(null));
    }
}
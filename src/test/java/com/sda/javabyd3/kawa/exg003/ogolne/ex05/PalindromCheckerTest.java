package com.sda.javabyd3.kawa.exg003.ogolne.ex05;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromCheckerTest {

    PalindromChecker test = new PalindromChecker();

    @Test
    public void checkingIfPalindrom() {
        Assert.assertTrue("error, ten ciag znakow to nie palindrom",test.checkingIfPalindrom("Moze jutro ta " +
                "dama da tortu jezom"));
    }
}
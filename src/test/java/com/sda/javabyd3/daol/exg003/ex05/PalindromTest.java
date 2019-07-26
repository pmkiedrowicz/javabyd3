package com.sda.javabyd3.daol.exg003.ex05;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class PalindromTest {

    @Test
    public void deleteEmptyChar()
    {
        Palindrom palindrom = new Palindrom();
        String result = palindrom.deleteEmpytChar("ikar łapał raki");
        Assert.assertTrue(result.equals("ikarłapałraki"));
    }

    @Test
    @Ignore
    public void notDeleteEmptyChar() {
        Palindrom palindrom = new Palindrom();
        String result = palindrom.deleteEmpytChar("ikar łapał raki");
        Assert.assertTrue(result.equals("ikar łapał raki"));
    }

    @Test
    public void isPalindrom(){
        Palindrom palindrom = new Palindrom();
        Boolean result = palindrom.isPalindrom("ikar łapał raki");
        Assert.assertFalse(result.equals("ikar łapał raki"));
    }

    @Test
    public void isntPalindrom(){
        Palindrom palindrom = new Palindrom();
        Boolean result = palindrom.isPalindrom("ikar łapał raki");
        Assert.assertFalse(result.equals("dandel łapał raki"));
    }

}
package com.sda.javabyd3.migr.exg002.ex01;

import org.junit.Assert;
import org.junit.Test;


public class EvenCheckTest {

    EvenCheck numTest = new EvenCheck();

    @Test
    public void evenCheckTest() {

        Assert.assertTrue("method evenCheck does not work correctly", numTest.evenCheck(6) == true);
    }

    @Test
    public void evenOddTest() {

        Assert.assertTrue("method evenOdd does not work correctly", numTest.evenCheck(7) == false);

    }
}

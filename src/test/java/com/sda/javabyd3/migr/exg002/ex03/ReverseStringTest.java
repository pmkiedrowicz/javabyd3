package com.sda.javabyd3.migr.exg002.ex03;

import org.junit.Assert;
import org.junit.Test;

public class ReverseStringTest {

    @Test
    public void reverseString() {
        ReverseString test = new ReverseString();
        Assert.assertNotEquals("error",test.reverseString("dupa").equals("apud"));

    }
}
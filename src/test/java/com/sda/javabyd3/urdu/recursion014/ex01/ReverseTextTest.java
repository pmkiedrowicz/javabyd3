package com.sda.javabyd3.urdu.recursion014.ex01;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseTextTest {

    ReverseText reverseText = new ReverseText();
    String text = "tygrys";

    @Test
    public void backwards() {

        Assert.assertEquals(reverseText.backwards(text, text.length()-1),"syrgyt");
    }

    @Test
    public void backLoop() {

        Assert.assertEquals(reverseText.backLoop(text),"syrgyt");

    }
}
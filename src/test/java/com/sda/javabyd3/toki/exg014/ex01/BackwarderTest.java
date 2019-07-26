package com.sda.javabyd3.toki.exg014.ex01;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class BackwarderTest {
Backwarder backwarder=new Backwarder();
    @Test
    public void backwards() {
        String word="Catacombs";
        String expected="sbmocataC";
        Assert.assertEquals(expected,backwarder.backwards(word,word.length()-1));
    }
}
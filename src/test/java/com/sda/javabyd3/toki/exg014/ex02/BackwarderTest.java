package com.sda.javabyd3.toki.exg014.ex02;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class BackwarderTest {
Backwarder backwarder=new Backwarder();

    @Test
    public void addThemAll() {
        int number=6;
        int number2=8;
        int number3=-7;
        int result=21;
        int result2=36;
        int result3=0;
        Assert.assertEquals(result,backwarder.addThemAll(number));
        Assert.assertEquals(result2,backwarder.addThemAll(number2));
        Assert.assertEquals(result3,backwarder.addThemAll(number3));
    }
}
package com.sda.javabyd3.toki.exg007oop.ex03;

import org.junit.Assert;
import org.junit.Test;

public class AddsTest {
        Adds adds=new Adds();

    @Test
    public void summedNumbers() {
        Integer sum500=500;
        Assert.assertEquals(sum500,adds.summedNumbers(321,52,32,4,66,25));
    }
}
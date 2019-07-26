package com.sda.javabyd3.syga.exg003.ex03;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseTest {

    @Test
    public void sholudReverseString(){
        Reverse reverse = new Reverse();
        Assert.assertEquals("tok", reverse.textReverse("kot"));
    }

}
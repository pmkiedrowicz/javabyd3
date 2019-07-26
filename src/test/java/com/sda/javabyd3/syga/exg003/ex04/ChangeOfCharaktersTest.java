package com.sda.javabyd3.syga.exg003.ex04;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ChangeOfCharaktersTest {

    @Test
    public void shouldChangeOfCharakters(){
        ChangeOfCharakters changeOfCharakters = new ChangeOfCharakters();
        Assert.assertEquals("jesc", changeOfCharakters.changeCharakters("jeść"));
    }

}
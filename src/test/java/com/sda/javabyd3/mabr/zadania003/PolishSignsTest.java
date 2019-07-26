package com.sda.javabyd3.mabr.zadania003;

import org.junit.Assert;
import org.junit.Test;

public class PolishSignsTest {

    @Test
    public void Change() {
        PolishSigns polishSigns = new PolishSigns();
        String result = polishSigns.Change("łążć");
        Assert.assertTrue(true);
    }
}

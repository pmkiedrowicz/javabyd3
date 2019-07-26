package com.sda.javabyd3.migr.exg002.ex04;

import org.junit.Assert;
import org.junit.Test;

public class PolishCharRemoverTest {

    PolishCharRemover test = new PolishCharRemover();
    @Test
    public void stripAccents() {
        Assert.assertEquals("aozp",test.stripAccents("ąóźp"));

    }
}
package com.sda.javabyd3.toki.exg003general.general.ex01;

import junit.framework.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class CheckerTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void shouldCheckIfTheNumberIsEvenOrOdd() {
        Checker checker = new Checker();
        Boolean result = checker.checker(7);
        Assert.assertTrue("EvenOrOdd does not work correctly. Expected " + result + " but was ", result == false);
    }
}
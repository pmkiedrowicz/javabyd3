package com.sda.javabyd3.toki.exg014.ex03.check;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialTest {
Factorial factorial=new Factorial();
    @Test
    public void factorial() {
        long number=20L;
        long result=2432902008176640000L;
        Assert.assertEquals(result, factorial.factorial(number));
    }
}
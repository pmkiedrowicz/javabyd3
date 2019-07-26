package com.sda.javabyd3.toki.exg014.ex04;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FibonacciTest {
    Fibonacci fibonacci=new Fibonacci();

    @Test
    public void fibbonaci() {
        int n=15;
        int result=610;
        Assert.assertEquals(result,fibonacci.fibbonaci(n));
    }
}
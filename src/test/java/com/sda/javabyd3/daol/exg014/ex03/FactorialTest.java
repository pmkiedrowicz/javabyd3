package com.sda.javabyd3.daol.exg014.ex03;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FactorialTest {
    Factorial factorial = new Factorial();

    @Test
    public void calculate() {
        assertEquals(1L, factorial.calculate(0));
        assertEquals(1L,factorial.calculate(1));
        assertEquals(1307674368000L, factorial.calculate(15));
    }

    @Test
    public void calculateUsingForLoop() {
        assertEquals(1L, factorial.calculate(0));
        assertEquals(1L,factorial.calculate(1));
        assertEquals(1307674368000L, factorial.calculateUsingForLoop(15));
    }
}
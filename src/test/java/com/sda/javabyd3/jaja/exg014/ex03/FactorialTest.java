package com.sda.javabyd3.jaja.exg014.ex03;

import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialTest {

    private final Factorial factorial = new Factorial();
    @Test
    public void calculate() {
        assertEquals(1L,factorial.calculate(0));
        assertEquals(1L, factorial.calculate(1));
        assertEquals(2432902008176640000L,factorial.calculate(20));
    }

    @Test
    public void calculateUsingForLoop() {
        assertEquals(1L,factorial.calculate(0));
        assertEquals(1L, factorial.calculate(1));
        assertEquals(2432902008176640000L,factorial.calculateUsingForLoop(20));
    }
}
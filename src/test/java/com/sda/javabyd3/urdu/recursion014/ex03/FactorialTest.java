package com.sda.javabyd3.urdu.recursion014.ex03;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class FactorialTest {

    private final Factorial factorial = new Factorial();
    @Test
    public void calculate() {
        assertEquals(1L,factorial.calculate(0));
        assertEquals(1L,factorial.calculate(1));
        assertEquals(1307674368000L,factorial.calculate(15));
        assertThat(factorial.calculate(15), is(1307674368000L));
    }

    @Test
    public void calculateWithLoop() {
        assertEquals(1L, factorial.calculateWithLoop(0));
        assertEquals(1L, factorial.calculateWithLoop(1));
        assertEquals(1307674368000L,factorial.calculateWithLoop(15));
    }
}
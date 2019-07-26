package com.sda.javabyd3.kawa.exg014.ex03;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class FactorialTest {

    Factorial test = new Factorial();

    @Test
    public void calculate() {
        assertEquals(1L,test.calculate(0));
        assertEquals(1L,test.calculate(1));
        assertEquals(1307674368000L, test.calculate(15));
        assertThat(test.calculate(15),is(1307674368000L));
    }

    @Test
    public void calculateUsingFor() {
        assertEquals(1L,test.calculate(0));
        assertEquals(1L,test.calculate(1));
        assertEquals(1307674368000L, test.calculate(15));
    }
}
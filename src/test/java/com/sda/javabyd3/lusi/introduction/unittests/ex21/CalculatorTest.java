package com.sda.javabyd3.lusi.introduction.unittests.ex21;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class CalculatorTest {

    @Test
    public void sumTest() {
        assertThat(new Calculator().sum(3, 7), is(10));
    }

    @Test
    public void substractTest() {
        assertThat(new Calculator().substract(10, 3), is(7));
    }

    @Test
    public void multiplyTest() {
        assertThat(new Calculator().multiply(5, 11), is(55));
    }

    @Test
    public void divideTest() {
        assertThat(new Calculator().divide(18, 3), is(6d));
    }
}

package com.sda.javabyd3.wowa.exg011.ex01;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;

public class QuadraticEquationTest {

    QuadraticEquation qe = new QuadraticEquation(1, 5, 2);

    @Test
    public void isGetDeltaOk() {
        double result = qe.getDelta();
        Assert.assertThat(result, is(17.0));
    }

    @Test
    public void isGetAnswer1Ok() {
        double result = qe.getAnswer1();
        Assert.assertThat(result, is(-0.4384471871911697));
    }

    @Test
    public void isGetAnswer2Ok() {
        double result = qe.getAnswer2();
        Assert.assertThat(result, is(-4.561552812808831));
    }
}

package com.sda.javabyd3.lusi.introduction.unittests.ex24;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class BmiCalculatorTest {

    @Test
    public void bmiCalcTest() {
        float bmi = new BmiCalculator().calculate(85, 1.85f);
        assertThat(bmi, is(24.84f));
    }
}

package com.sda.javabyd3.mizi.exg009.ex05;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Michal Ziolecki.
 */
public class CalculatorMethodTest {
    CalculatorMethod calculatorMethod = new CalculatorMethod();
    @Test
    public void sum() throws Exception {
        Assert.assertEquals( 4, calculatorMethod.sum( 2,2 ) );
    }

    @Test
    public void substract() throws Exception {
        Assert.assertEquals( -2, calculatorMethod.substract( 3,5 ) );
    }

    @Test
    public void multiply() throws Exception {
        Assert.assertEquals( 6, calculatorMethod.multiply( 2,3 ) );
    }

    @Test
    public void devide() throws Exception {
        Assert.assertEquals( 5.0, calculatorMethod.divide( 10,2 ), 0.00 );
    }

}
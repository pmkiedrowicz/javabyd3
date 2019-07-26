package com.sda.javabyd3.urdu.exg007.ex03;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SumNNumbersTest {

    @Test
    public void sumNumbers() {
        SumNNumbers sumNNumbers= new SumNNumbers();
        Assert.assertTrue(sumNNumbers.sumNumbers(1,2,3,4)==10);

    }
}
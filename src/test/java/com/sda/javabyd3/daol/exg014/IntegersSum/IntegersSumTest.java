package com.sda.javabyd3.daol.exg014.IntegersSum;

import com.sda.javabyd3.daol.exg014.ex02.IntegersSum;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class IntegersSumTest {

    @Test
    @Ignore
    public void sumRecursion() {
        IntegersSum integersSum = new IntegersSum();
        Integer result = integersSum.sumRecursion(15);
        Assert.assertTrue(result.equals(15));
    }
}
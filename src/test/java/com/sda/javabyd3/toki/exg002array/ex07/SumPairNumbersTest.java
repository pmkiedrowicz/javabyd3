package com.sda.javabyd3.toki.exg002array.ex07;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SumPairNumbersTest {
    SumPairNumbers sumPairNumbers = new SumPairNumbers();

    @Test
    public void sumPairNumbers() {
        int[] numbers = {2, 3, 8, 9, 22, 23, 32, 33};
        int result = 64;
        Assert.assertEquals(result, sumPairNumbers.sumPairNumbers(numbers));
    }
}
package com.sda.javabyd3.toki.exg002array.ex07;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SumUnpairNumbersTest {
    SumUnpairNumbers sumUnpairNumbers = new SumUnpairNumbers();

    @Test
    public void sumUnpairNumbers() {
        int[] numbers = {2, 3, 8, 9, 22, 23, 32, 33};
        int result = 68;
        Assert.assertEquals(result, sumUnpairNumbers.sumUnpairNumbers(numbers));
    }
}
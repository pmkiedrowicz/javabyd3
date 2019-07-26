package com.sda.javabyd3.wowa.exg004StreamLambda.ex05;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;

public class Stream_5Test {
    @Test
    public void isHigherThanAverageOk() {
        Stream_5 zad5 = new Stream_5();
        int[] numbers = new int[]{148, 105, 36, 37, 56, 132, 121, 36, 180,
                8, 61, 171, 180, 6, 65, 0, 66, 58, 162, 25, 128, 35, 32, 4, 104,
                6, 75, 31, 66, 125, 188, 159, 121, 61, 173, 188, 34, 141, 182,
                192, 18, 18, 165, 136, 76, 64, 41, 195, 147, 74};

        int result = zad5.howManyHigherThanAverageValue(numbers);
        Assert.assertThat(result, is(23));
    }
}

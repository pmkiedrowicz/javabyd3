package com.sda.javabyd3.mabr.algorytmy;

import org.junit.Assert;
import org.junit.Test;

public class CountingTest {

    @Test
    public void countingSort() {
        Counting counting = new Counting();
        int[] arr = new int[]{1,4,7,3,4,5,6,3,4,8,6,4,4};

        int[] sorted = counting.countingSort(arr);
        Assert.assertArrayEquals(new int[]{1,3,3,4,4,4,4,4,5,6,6,7,8}, sorted);

    }
}
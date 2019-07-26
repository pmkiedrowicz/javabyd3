package com.sda.javabyd3.lusi.exg011.ex03;

import org.junit.Assert;
import org.junit.Test;

public class CountingSortTest {

    @Test
    public void sort() {
        int[] array = new int[]{4, 2, 9, 44, 1, 33};
        CountingSort countingSort = new CountingSort();
        Assert.assertArrayEquals(new int[]{1, 2, 4, 9, 33, 44}, countingSort.sort(array));
    }
}
package com.sda.javabyd3.lusi.exg011.bubblesort;

import org.junit.Assert;
import org.junit.Test;

public class BubbleSortTest {

    @Test
    public void sort() {
        int[] array = new int[]{4, 2, 9, 44, 1, 33};
        BubbleSort bubbleSort = new BubbleSort();
        Assert.assertArrayEquals(new int[]{1, 2, 4, 9, 33, 44}, bubbleSort.sort(array));
    }
}
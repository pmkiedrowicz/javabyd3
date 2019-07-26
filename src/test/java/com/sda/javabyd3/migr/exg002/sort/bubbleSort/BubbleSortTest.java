package com.sda.javabyd3.migr.exg002.sort.bubbleSort;

import org.junit.Assert;
import org.junit.Test;

public class BubbleSortTest {

    BubbleSort test = new BubbleSort();
    @Test
    public void sortuj() {

        int[] arrTest = {4,12,65,0};
        int[] arrTestSorted = {0,4,12,65};
        Assert.assertArrayEquals( arrTestSorted, test.sortuj(arrTest));
    }
}
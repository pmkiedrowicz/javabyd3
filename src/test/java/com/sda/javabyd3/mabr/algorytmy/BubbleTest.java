package com.sda.javabyd3.mabr.algorytmy;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class BubbleTest {

    private Bubble bubble = new Bubble();

    @Test
    public void bubbleSort() {
        int[] values = {9, -3, 5, 0, 1};
        int[] expectedOrder = {-3, 0, 1, 5, 9};

        bubble.BubbleSort(values);

        assertArrayEquals(expectedOrder, values);
    }

    @Test
    public void printArray() {

        int[] result = {-3, 0, 1, 5, 9};

        bubble.PrintArray(result);
        Assert.assertTrue(true);
    }
}
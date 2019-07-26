package com.sda.javabyd3.toki.exg0011.ex01;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class BubbleSortTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void doesItSort() {
        BubbleSort bubbleSort = new BubbleSort();
        int[] tab = {22, 54, 23, 45, 65};
        int[] result = {65, 54, 45, 23, 22};

        Assert.assertArrayEquals(result, bubbleSort.bubbleSort(tab));
    }
}
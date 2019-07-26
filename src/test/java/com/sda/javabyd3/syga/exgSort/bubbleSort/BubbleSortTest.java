package com.sda.javabyd3.syga.exgSort.bubbleSort;

import com.sda.javabyd3.syga.exg011.bubbleSort.BubbleSort;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class BubbleSortTest {
    @Test
    public void shouldSortTab(){
        BubbleSort bubbleSort = new BubbleSort();
        int[] tab = {5,8,2,3,9,4,22};
        int[] tabSorted = {2,3,4,5,8,9,22};
        int[] result = bubbleSort.bubblesort(tab);
        Assert.assertArrayEquals(tabSorted, result);
    }

}
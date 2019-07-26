package com.sda.javabyd3.urdu.sorting;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class BubbleSortTest {

    @Test
    public void sortedBubble() {
        BubbleSort bubbleSort = new BubbleSort();
        int[] numbers = new int[]{11, 10, 5, 6, 9, 22};
        int[] result = bubbleSort.sortedBubble(numbers);
        int[] sorted = new int[]{5, 6, 9, 10, 11, 22};

        // Assert.assertEquals(Arrays.toString(result),Arrays.toString(sorted));

        Assert.assertArrayEquals(result, sorted);
    }
}
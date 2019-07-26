package com.sda.javabyd3.urdu.sorting;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CountedSortTest {

    @Test
    public void sortedCount() {
        CountedSort countedSort = new CountedSort();
        int[] numbers = new int[]{10, 15, 33, 4, 66, 9};
        int[] result = countedSort.sortedCount(numbers);
        int[] sorted = new int[]{4, 9, 10, 15, 33, 66};
        Assert.assertArrayEquals(result, sorted);

    }

    @Test
    public void maxElement() {
        CountedSort countedSort = new CountedSort();
        int[] numbers = new int[]{10, 15, 33, 4, 66, 9};
        int max= countedSort.maxElement(numbers);
        Assert.assertEquals(" Result is not correct, expected 66, but was "+ max,66,max);

    }

}
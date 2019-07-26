package com.sda.javabyd3.mizi;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Michal Ziolecki.
 */
public class BubbleSortTest {
    @Test
    public void bubbleSort() {
        int tableToSort[] = {3, 60, 35, 2, 45, 320, 5};
        int tableSort[] = {2, 3, 5, 35, 45, 60, 320};
        Assert.assertArrayEquals( tableSort, BubbleSort.bubbleSort( tableToSort ) );
    }

}
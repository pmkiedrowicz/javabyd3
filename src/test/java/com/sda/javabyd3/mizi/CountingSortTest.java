package com.sda.javabyd3.mizi;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Michal Ziolecki.
 */
public class CountingSortTest {
    @Test
    public void countingSortO(){
        int tableToSort[] = {3, 60, 35, 2, 45,20, 5, 60};
        int tableSort[] = {60, 60, 45, 35, 20, 5, 3, 2};
        Assert.assertArrayEquals( tableSort, CountingSort.countingSortO( tableToSort ) );
    }

}
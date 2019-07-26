package com.sda.javabyd3.kawa.sorty.sortowanieBabelkowe;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortBabelkowyTest {

    SortBabelkowy test = new SortBabelkowy();
    int[] listForTest = {21, 2, 1, 4, 4, 255};
    int[] sortedList = {1, 2, 4, 4, 21, 255};

    @Test
    public void sortingB() {
        Assert.assertArrayEquals("error", test.sortingB(listForTest), sortedList);
    }
}

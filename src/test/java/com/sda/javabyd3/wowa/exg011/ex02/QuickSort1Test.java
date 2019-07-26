package com.sda.javabyd3.wowa.exg011.ex02;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class QuickSort1Test {

    @Test
    public void isQuickSort1Ok() {
        int arr[] = {3, 6, 2, 11, 8, 7, 5, 7};
        int result[] = {2, 3, 5, 6, 7, 7, 8, 11};
        QuickSort1 qs = new QuickSort1();
        Assert.assertArrayEquals(result, qs.quickSort1(arr, 0, (arr.length - 1)));
        System.out.println(Arrays.toString(arr));
    }
}

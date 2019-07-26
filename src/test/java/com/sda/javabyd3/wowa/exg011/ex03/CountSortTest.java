//Przygotuj program sortujący tablicę metodą przez zliczanie
//Dane wejściowe: Elementy tablicy nieposortowanej
//Dane wyjściowe: Tablica posortowana

package com.sda.javabyd3.wowa.exg011.ex03;

import org.junit.Assert;
import org.junit.Test;

public class CountSortTest {

    @Test
    public void isCountSortOk() {
        CountSort cs = new CountSort();
        int arr[] = {3, 6, 1, 7, 9, 3, 2, 1, 8, 4};
        int result[] = {1, 1, 2, 3, 3, 4, 6, 7, 8, 9};
        Assert.assertArrayEquals(cs.countSort(arr), result);
    }
}
//Przygotuj program sortujący tablicę metodą QuickSort
//Dane wejściowe: Elementy tablicy nieposortowanej
//Dane wyjściowe: Tablica posortowana
//pivot na srodku

package com.sda.javabyd3.wowa.exg011.ex02;

import java.util.Arrays;

public class QuickSort1Run {
    public static void main(String[] args) {
        int arr[] = {3, 6, 7, 2, 11, 8, 7, 5};
        QuickSort1 qs = new QuickSort1();
        int sortedArr[] = qs.quickSort1(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(sortedArr));
    }
}

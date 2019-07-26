//Przygotuj program sortujący tablicę metodą QuickSort
//Dane wejściowe: Elementy tablicy nieposortowanej
//Dane wyjściowe: Tablica posortowana
//pivot na koncu

package com.sda.javabyd3.wowa.exg011.ex02;

import java.util.Arrays;

public class QuickSort2Run {
    public static void main(String[] args) {
        int arr[] = {4, 6, 2, 7, 6, 8, 11};
        QuickSort2 qs = new QuickSort2();
        qs.sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}

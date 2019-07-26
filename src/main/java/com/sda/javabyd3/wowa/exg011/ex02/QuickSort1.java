//Przygotuj program sortujący tablicę metodą QuickSort
//Dane wejściowe: Elementy tablicy nieposortowanej
//Dane wyjściowe: Tablica posortowana
//pivot na srodku

package com.sda.javabyd3.wowa.exg011.ex02;

import java.util.Arrays;

public class QuickSort1 {
    public int[] quickSort1(int[] a, int left, int right) {
        int i = left;
        int j = right;
        int temp;
        int pivot = a[(left + right) / 2]; //pivot na srodku tablicy

        do {
            System.out.print(Arrays.toString(a));
            System.out.println("p = " + pivot);
            while (a[i] < pivot) i++;
            while (a[j] > pivot) j--;
            if (i <= j) {
                temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
                j--;
            }

        } while (i <= j);

        if (left < j) quickSort1(a, left, j);
        if (i < right) quickSort1(a, i, right);

        return a;
    }
}

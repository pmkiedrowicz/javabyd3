package com.sda.javabyd3.lusi.exg011.ex02;

import java.util.Arrays;

public class QuickSort {
    public int[] quickSort(int[] a, int left, int right) {
        int i = left;
        int j = right;
        int temp;
        int pivot = a[(left + right) / 2];

        do {
            System.out.print(Arrays.toString(a));
            System.out.println("p=" + pivot);
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

        if (left < j) quickSort(a, left, j);
        if (i < right) quickSort(a, i, right);

        return a;
    }
}

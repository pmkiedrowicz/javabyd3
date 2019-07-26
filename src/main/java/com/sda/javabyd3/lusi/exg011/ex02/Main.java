package com.sda.javabyd3.lusi.exg011.ex02;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // int[] unsortedArray = {7, 34, 12, 54, 76, 13, 4, 1, 76, 32, 15, 55, 11, 7, 99, 18, 25};
        int[] unsortedArray = {4, 8, 2, 6, 7, 1, 3, 5};
        QuickSort quickSort = new QuickSort();
        int sortedArray[] = quickSort.quickSort(unsortedArray, 0, (unsortedArray.length - 1));
        System.out.println(Arrays.toString(sortedArray));
    }
}

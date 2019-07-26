package com.sda.javabyd3.wowa.CountingSort;

import java.util.Arrays;

public class CountingSortRun {
    public static void main(String[] args) {
        int array[] = {6, 2, 3, 4, 5, 3};
        System.out.println("unsorted: " + Arrays.toString(array));

        CountingSort sortedArray = new CountingSort();
        System.out.println(Arrays.toString(sortedArray.countingSort(array)));
    }
}

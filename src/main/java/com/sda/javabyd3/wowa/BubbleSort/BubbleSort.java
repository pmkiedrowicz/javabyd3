package com.sda.javabyd3.wowa.BubbleSort;

import java.util.Arrays;

public class BubbleSort {
    public int[] bubbleSort(int array[]) {
        int sortedArray[] = array.clone();
        int temp;
        for (int i = 0; i < sortedArray.length - 1; i++) {
            for (int j = 1; j < sortedArray.length; j++) {
                if (sortedArray[j - 1] > sortedArray[j]) {
                    temp = sortedArray[j - 1];
                    sortedArray[j - 1] = sortedArray[j];
                    sortedArray[j] = temp;
                }
            }
            System.out.println("Iteracja " + (i + 1) + ": " + Arrays.toString(sortedArray));
        }
        return sortedArray;
    }
}

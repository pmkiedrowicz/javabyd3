package com.sda.javabyd3.urdu.exg011.ex02;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] unsortedArray = new int[]{2,6,10,5,1,9,7,13,4};
        QuickSort quickSort = new QuickSort();

        int[] sortedArray = quickSort.quickSort(unsortedArray,0,unsortedArray.length-1);

        System.out.println(Arrays.toString(sortedArray));
    }
}

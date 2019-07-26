package com.sda.javabyd3.mabr.algorytmy;

import java.util.Arrays;

public class MainCounting {

    public static void main(String[] args) {
        Counting counting = new Counting();
        System.out.println("Before Sorting : ");
        int arr[]={1,4,7,3,4,5,6,3,4,8,6,4,4};
        System.out.println(Arrays.toString(arr));
        arr=counting.countingSort(arr);
        System.out.println("=======================");
        System.out.println("After Sorting : ");
        System.out.println(Arrays.toString(arr));
    }
}

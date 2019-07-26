package com.sda.javabyd3.migr.exg002.sort.countingSort;

public class CountingSort {

    public int[] countingSort(int[] arr) {

        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            } else if (arr[i] > max) {
                max = arr[i];
            }
        }
        int[] counts = new int[max - min + 1];

        for (int i = 0;  i < arr.length; i++) {
            counts[arr[i] - min]++;


    }
    return arr;
}}

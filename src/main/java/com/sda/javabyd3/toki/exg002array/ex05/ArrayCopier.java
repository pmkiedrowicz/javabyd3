package com.sda.javabyd3.toki.exg002array.ex05;

public class ArrayCopier {
    public int[] copyArray(int[] array) {
        int arrayLength = array.length;
        int[] copiedArray = new int[arrayLength];
        System.arraycopy(array, 0, copiedArray, 0, array.length);
        return copiedArray;
    }
}

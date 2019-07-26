package com.sda.javabyd3.jaja.designPatternEx.ex04;

public class BubbleSort implements SortingStrategy {

    @Override
    public int[] calculate(int[] array, int left, int right) {

        int checkStatus = 1;
        while (checkStatus > 0) {
            checkStatus = 0;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    checkStatus = 1;
                    int temporaryMemory = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = temporaryMemory;
                }
            }
        }
        return array;
    }
}


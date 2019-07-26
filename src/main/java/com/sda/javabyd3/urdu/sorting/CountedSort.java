package com.sda.javabyd3.urdu.sorting;

public class CountedSort {

    public int[] sortedCount(int[] array) {

        int[] sortedNumber = array;
        int[] countedNumber = new int[(maxElement(array))+1];
        int counter = 0;

        for (int i = 0; i < array.length; i++) {

            countedNumber[array[i]]++;
        }
        for (int i = 0; i < countedNumber.length; i++) {
            if (countedNumber[i] == 0) {
                //do nothing ;)
            } else {
                for (int j = 0; j < countedNumber[i]; j++) {
                    sortedNumber[counter] = i;
                    counter++;
                }
            }
        }

        return sortedNumber;
    }


    public int maxElement(int[] array) {
        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }
}

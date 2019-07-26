package com.sda.javabyd3.mabr.algorytmy;

public class Bubble {


    int[] BubbleSort(int[] list) {
        int[] result = list;
        for (int i = 0; i < result.length; i++) {
            for (int j = i + 1; j < result.length; j++) {
                if (result[i] > result[j]) {
                    int temp = result[i];
                    result[i] = result[j];
                    result[j] = temp;
                }
            }
        }
        return result;
    }

    public void PrintArray(int[] arr) {
        for (int aList : arr) {
            System.out.print(aList + ", ");
        }
    }
}


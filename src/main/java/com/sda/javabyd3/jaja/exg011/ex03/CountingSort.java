package com.sda.javabyd3.jaja.exg011.ex03;

public class CountingSort {

    int maxValue;
    public int[] countingSort(int[] array){
        int[] values = new int[maxValue+1];
        for (int i = 0; i<=maxValue; i++)
            values[i]=0;
            for (int i =0; i<array.length; i++){
                values[array[i]]++;
            }
            int[]array1 = new int[array.length];
            int k = 0;
            for (int i =0; i<=maxValue; i++){
                for (int j = 0; j<values[i]; j++){
                    array1[k++]=i;
                }
        } return array1;
    }
}

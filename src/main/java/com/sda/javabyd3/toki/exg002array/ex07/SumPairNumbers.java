package com.sda.javabyd3.toki.exg002array.ex07;

public class SumPairNumbers {
    private int pairSum;

    public int sumPairNumbers(int[] array) {

        for (int i = 0; i < array.length; i++) {
            if (i%2==0){
                pairSum+=array[i];
            }
        }

        return pairSum;
    }
}

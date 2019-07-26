package com.sda.javabyd3.toki.exg002array.ex07;

public class SumUnpairNumbers {
    private int unpairSum;

    public int sumUnpairNumbers(int[] array){

        for (int i = 0; i < array.length; i++) {
            if (i%2!=0){
                unpairSum+=array[i];
            }
        }
    return unpairSum;
    }
}

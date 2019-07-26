package com.sda.javabyd3.toki.exg002array.ex06;

import java.util.Arrays;

public class ReverseArray {
    public void reverse(int[] array){

        for (int i = 0; i < array.length/2; i++) {
            int temp=array[i];
            array[i]=array[array.length-(1+i)];
            array[array.length-(1+i)]=temp;
        }

        System.out.println(Arrays.toString(array));
    }
}

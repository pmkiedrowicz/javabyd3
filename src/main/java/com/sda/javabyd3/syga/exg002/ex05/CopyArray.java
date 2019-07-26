package com.sda.javabyd3.syga.exg002.ex05;

import java.util.Arrays;

public class CopyArray {
    public CopyArray(){

    }
    public int[] copyArray(int[] array){
        int[] array2;
       array2 = Arrays.copyOf(array, array.length);

       return array2;
    }
}

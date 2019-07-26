package com.sda.javabyd3.syga.exg002.ex04;

import java.util.Arrays;

public class EqualsArray {
    public EqualsArray(){

    }
    public boolean equals(int[] array1, int[] array2){
        boolean bool = false;
        if(Arrays.equals(array1,array2)){
            bool = true;
        }
        return bool;
    }
}

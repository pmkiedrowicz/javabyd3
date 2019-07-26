package com.sda.javabyd3.toki.exg002array.ex04;

import java.util.Arrays;

public class ArrayChecker {
    private boolean isItTrue=false;

    public boolean equals(int[] array1, int[] array2){
    isItTrue= Arrays.equals(array1,array2);

    return isItTrue;
    }
}

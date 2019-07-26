package com.sda.javabyd3.toki.exg002array.ex08;

import java.lang.reflect.Array;

public class Checker {
    private boolean isItTrue = false;

    public boolean checkArray(int[] array) {

        int med = (int) Array.get(array, 1);
        int min = (int) Array.get(array, 0);
        int max = (int) Array.get(array, 2);

        if ((min == med - 1) && (max == med + 1)) {
            isItTrue = true;
        } else {
            isItTrue = false;
        }

        return isItTrue;
    }
}

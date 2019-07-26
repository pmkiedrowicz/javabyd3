package com.sda.javabyd3.toki.exg002array.ex04;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 2, 3, 4, 5};
        int[] array3 = {2, 1, 3, 4, 5};

        ArrayChecker arrayChecker = new ArrayChecker();
        System.out.println("Input arrays: " + Arrays.toString(array1) + Arrays.toString(array2));
        System.out.println(arrayChecker.equals(array1, array2) + "\n");

        System.out.println("Input arrays: "+ Arrays.toString(array1)+Arrays.toString(array3));
        System.out.println(arrayChecker.equals(array1,array3));
    }
}

package com.sda.javabyd3.toki.exg002array.ex08;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arrayForTrue = {4, 5, 6};
        int[] arrayForFalse = {8, 4, 6};

        Checker checker = new Checker();
        System.out.println("Input array: " + Arrays.toString(arrayForTrue));
        System.out.println(checker.checkArray(arrayForTrue));

        System.out.println("Input array: " + Arrays.toString(arrayForFalse));
        System.out.println(checker.checkArray(arrayForFalse));
    }
}

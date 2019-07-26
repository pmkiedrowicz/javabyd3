package com.sda.javabyd3.daol.exampleOthersSorting.Bubble;

import java.util.Arrays;

public class SortBubble {
    public static int[] sortBubble(int[] input) {
        for (int i = input.length - 1; i > 1; i--) {
            for (int j = 0; j < i; j++) {
                if (input[j] > input[j + 1]) {
                    int x = input[j];
                    input[j] = input[j + 1];
                    input[j + 1] = x;
                }
            }
        }return input;

    }
    public static void seeTable (int[] input) {
//        for (int x : input) {
//            System.out.printf(x + " ");
        System.out.println(Arrays.toString(input));
        }
    }



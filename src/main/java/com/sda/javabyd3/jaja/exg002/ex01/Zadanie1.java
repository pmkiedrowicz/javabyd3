package com.sda.javabyd3.jaja.exg002.ex01;

public class Zadanie1 {
    public static void printIntArray(int[] array) {
        System.out.print("{");
        for (int i = 0; i < array.length-1; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println(array[array.length -1] + "}");
    }
}

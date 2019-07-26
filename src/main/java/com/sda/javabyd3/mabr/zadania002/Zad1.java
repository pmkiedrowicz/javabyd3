package com.sda.javabyd3.mabr.zadania002;

public class Zad1 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};
        printArray(array);
    }

    public static void printArray(int[] array) {
        System.out.print("{");
        for (int i : array) {
            System.out.print(" x" + i);
            if (i != array.length) System.out.print(",");
        }
        System.out.println(" }");
    }
}

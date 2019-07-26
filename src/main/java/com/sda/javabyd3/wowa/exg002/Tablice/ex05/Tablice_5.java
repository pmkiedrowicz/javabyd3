//Napisz program, który zwraca kopię podanej tablicy. Sygnatura metody kopiującej
//jest następująca:
//public int[] copyArray(int[] array)

package com.sda.javabyd3.wowa.exg002.Tablice.ex05;

import java.util.Arrays;

public class Tablice_5 {
    public static int[] copyArray(int[] array) {
        int newArray[] = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        return newArray;
    }

    public static void main(String[] args) {
        int array1[] = {2, 4, 5, 7, 9, 0, 3, 2};
        System.out.println("Array to copy: " + Arrays.toString(array1));
        int newArray[] = copyArray(array1);
        System.out.println("newArray copied from first one: " + Arrays.toString(newArray));
    }
}

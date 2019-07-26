//Napisz program, który sprawdza czy w danej tablicy “array” znajduje się szukana
//liczba “key”. Sygnatura metody jest następująca:
//public boolean contains(int[] array, int key)

package com.sda.javabyd3.wowa.exg002.Tablice.ex03;

import java.util.Arrays;

public class Tablice_3 {
    public static boolean contains(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int array[] = {2, 4, 5, 7, 9, 0, 3};
        int key = 9;
        System.out.println("Array: " + Arrays.toString(array) + ", key: " + key);
        System.out.println("Does array contain key? : " + contains(array, key));
    }
}

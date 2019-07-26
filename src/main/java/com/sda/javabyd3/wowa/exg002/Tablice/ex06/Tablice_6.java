//Napisz program, który zwraca tablicę w kolejności odwrotnej niż podana.
//Przykładowo dla tablicy [1, 5, 6, 9, 55] program zwraca tablicę [55, 9, 6, 5, 1].
//Sygnatura metody odwracającej tablicę jest następująca:
//public void reverse(int[] array)

package com.sda.javabyd3.wowa.exg002.Tablice.ex06;

import java.util.Arrays;

public class Tablice_6 {
    public static void reverse(int[] array) {

        for (int i = array.length - 1; i > 0; i--) {
            System.out.print(array[i] + ", ");
        }
        System.out.println(array[0]);
    }

    public static void main(String[] args) {
        int array1[] = {2, 4, 5, 9, 0, 3, 1};
        System.out.println("Array: " + Arrays.toString(array1));
        System.out.print("Reversed array: ");
        reverse(array1);
    }
}

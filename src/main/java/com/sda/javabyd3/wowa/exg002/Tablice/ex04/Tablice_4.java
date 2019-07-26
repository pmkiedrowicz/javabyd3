//Napisz program, który sprawdza czy podane 2 tablice są identyczne. Sygnatura
//metody sprawdzającej jest następująca
//public boolean equals(int[] array1, int[] array2)

package com.sda.javabyd3.wowa.exg002.Tablice.ex04;

import java.util.Arrays;

public class Tablice_4 {
    public static boolean equals(int[] array1, int[] array2) {
//          return Arrays.equals(array1,array2); - to samo co nizej, dla leniwych

        if (array1.length != array2.length) {
            return false;
        }

        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != (array2[i])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int array1[] = {2, 4, 5, 7, 9, 0, 3, 2};
        int array2[] = {2, 4, 5, 7, 9, 0, 3};
        int array3[] = {2, 4, 5, 7, 9, 0, 3};
        int array4[] = {2, 4, 5, 7, 9, 0, 3};

        System.out.print("Array1: " + Arrays.toString(array1) + " Array2: " + Arrays.toString(array2));
        System.out.println(" Are those arrays equal?: " + equals(array1, array2));

        System.out.print("Array3: " + Arrays.toString(array3) + " Array4: " + Arrays.toString(array4));
        System.out.println(" Are those arrays equal?: " + equals(array3, array4));
    }
}

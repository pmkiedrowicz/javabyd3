//Napisz program zwracający tablicę w następującym formacie tekstowym { x1, x2, x3, x4, x5, x6 }
//Metoda wyświetlająca tablicę ma następującą sygnaturę
//public String printArray(int[] array)

package com.sda.javabyd3.wowa.exg002.Tablice.ex02;

import java.util.Arrays;

public class Tablice_2 {
    public static String printArray(int[] array) {
        return Arrays.toString(array);
    }

    public static void main(String[] args) {
        int array[] = {2, 4, 5, 7, 9, 0, 3};
        System.out.println(printArray(array));
    }
}

//Napisz program, który oblicza osobno sumę liczb w tablicy na pozycjach parzystych
//i nieparzystych, a następnie sprawdza która suma jest większa wyświetlając
//stosowny komunikat. Przygotuj testy jednostkowe sprawdzające działanie metody.

package com.sda.javabyd3.wowa.exg002.Tablice.ex07;

import java.util.Arrays;

public class Tablice_7 {
    public static String checkSumFromArray(int[] array) {
        int sumEven = 0;
        int sumOdd = 0;

        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                sumEven += array[i];
            } else {
                sumOdd += array[i];
            }
        }

        if (sumEven > sumOdd) {
            return "sumEven > sumOdd";
        } else {
            return "sumOdd > sumEven";
        }
    }

    public static void main(String[] args) {
        int array1[] = {1, 0, 1, 0, 1, 0, 1};
        int array2[] = {0, 1, 0, 1, 0, 1, 0};

        System.out.println("Array1: " + Arrays.toString(array1));
        System.out.println(checkSumFromArray(array1));

        System.out.println("\nArray2: " + Arrays.toString(array2));
        System.out.println(checkSumFromArray(array2));
    }
}

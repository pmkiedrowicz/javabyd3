//Napisz program wyświetlający tablicę w formacie { x1, x2, x3, x4, x5, x6 }
//Metoda wyświetlająca tablicę ma następującą sygnaturę
//public void printArray(int[] array)

package com.sda.javabyd3.wowa.exg002.Tablice.ex01;

public class Tablice_1 {

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.print(array[array.length - 1]);
    }

    public static void main(String[] args) {
        int array[] = {2, 4, 5, 7, 9, 0, 3};
        printArray(array);
    }
}

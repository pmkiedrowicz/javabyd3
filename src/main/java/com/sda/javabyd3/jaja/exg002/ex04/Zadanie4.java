package com.sda.javabyd3.jaja.exg002.ex04;

import java.util.Arrays;

public class Zadanie4 {
    public boolean equals(int[] array1, int[] array2){
        if (Arrays.equals(array1,array2)){
            System.out.println("Dwie tablice są identyczne. Wynik sprawdzania to: ");
            return true;
        }
        System.out.println("Dwie tablice nie są identyczne. Wynik sprawdzania to: ");
        return false;
    }
}

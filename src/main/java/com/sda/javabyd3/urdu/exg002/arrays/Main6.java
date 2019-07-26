package com.sda.javabyd3.urdu.exg002.arrays;

import java.util.Arrays;

public class Main6 {
    public static void main(String[] args) {

        int[] numbers = {1, 5, 6, 9, 55};
        int[] copy = reverse(numbers);
        System.out.println(Arrays.toString(copy));
    }
//metoda zwracająca tablicę
    public static int[] reverse(int[] array){

        int[] copy= new int[array.length];
        int j=0;
        for(int i=array.length-1;i>=0;i--){

            copy[j]=array[i];
            j++;
        }

        return copy;
    }

    //metoda zastępująca tablice odwrotnością : w trakcie tworzenia :)
}

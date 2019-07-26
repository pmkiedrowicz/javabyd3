package com.sda.javabyd3.urdu.exg002.arrays;

import java.util.Arrays;

public class Main5 {

    public static void main(String[] args) {

        int numbers[] = {1, 2, 4, 5, 6, 7, 10};
        int[] copy = copyArray(numbers);
       // System.out.println( Arrays.toString(copyArray(numbers)));
        System.out.println(Arrays.toString(copy));

        int[] copy2 = copyArrayManualy(numbers);
        System.out.println(Arrays.toString(copy2));

    }

    public static int[] copyArray(int[] array){

        int[] copy = (int[])array.clone();
        return copy;
    }

    public static int[] copyArrayManualy(int[] array){

        int[] copy= new int[array.length];

        for(int i=0;i<array.length;i++){
            copy[i]=array[i];
        }

        return copy;
    }


}

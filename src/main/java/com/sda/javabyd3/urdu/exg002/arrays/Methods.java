package com.sda.javabyd3.urdu.exg002.arrays;

import java.util.Arrays;

public class Methods {

    public void printArray(int[] array) {
        System.out.print("{ ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ",");
        }
        System.out.println("}");
    }

    public void printArray2(int[] array) {
        System.out.println(Arrays.toString(array));
    }


    public static String printArrayS(int[] array){

        return Arrays.toString(array);
    }

}

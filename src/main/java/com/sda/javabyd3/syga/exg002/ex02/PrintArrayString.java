package com.sda.javabyd3.syga.exg002.ex02;

import java.util.Arrays;

public class PrintArrayString {
    public PrintArrayString(){

    }

    public String printArray(int[] array){
        System.out.print("{");
        for (int i = 0; i < array.length; i++) {
            System.out.print("x" + array[i]);
            if(i != array.length -1){
                System.out.print(", ");
            }
        }
        System.out.print("}");
        return Arrays.toString(array);
    }
}

package com.sda.javabyd3.toki.exg002array.ex02;

public class ViewArray {
    public String printArray(int[] array) {
        System.out.print("{");
        for (int i = 0; i < array.length; i++) {
            System.out.print("x" + array[i]+",");
            if (i==array.length-1){
                System.out.print("\b");
            }
        }
        System.out.print("}");
    return null;
    }
}
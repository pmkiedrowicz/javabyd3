package com.sda.javabyd3.toki.exg002array.ex01;

public class ViewArray {
    public void printArray(int[] array) {
        System.out.print("{");
        for (int i = 0; i < array.length; i++) {
            System.out.print("x" + array[i]+",");
            if (i==array.length-1){
                System.out.print("\b");
            }
        }
        System.out.print("}");
    }
}

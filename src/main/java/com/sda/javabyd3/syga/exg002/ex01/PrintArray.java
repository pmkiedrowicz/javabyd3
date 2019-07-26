package com.sda.javabyd3.syga.exg002.ex01;

public class PrintArray {
    public PrintArray(){

    }

    public void printArray(int[] array){

        System.out.print("{");
        for (int i = 0; i < array.length; i++) {
            System.out.print("x" + array[i]);
            if(i != array.length -1){
                System.out.print(", ");
            }
        }
        System.out.print("}");
    }
}

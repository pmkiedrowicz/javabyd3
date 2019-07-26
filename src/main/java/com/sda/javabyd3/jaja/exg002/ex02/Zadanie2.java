package com.sda.javabyd3.jaja.exg002.ex02;

public class Zadanie2 {

    public String printArray(int[] array){
        System.out.print("{");
        for (int i =0; i < array.length-1; i++){
            System.out.print(array[i] + ", ");
        }
        System.out.println(array[array.length-1]+"}");
        return null;
    }
}

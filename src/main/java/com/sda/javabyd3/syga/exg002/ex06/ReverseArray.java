package com.sda.javabyd3.syga.exg002.ex06;



public class ReverseArray {
    public ReverseArray(){

    }
    public void reverse (int[] array){
        for (int i = array.length-1; i >= 0 ; i--) {
            System.out.print(array[i] + " ");
        }
    }
}

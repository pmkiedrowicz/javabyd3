package com.sda.javabyd3.syga.exg002.ex05;

public class Main {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6};
        int[] array2;

        CopyArray copyArray = new CopyArray();
        array2 = copyArray.copyArray(array);


        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }
    }
}

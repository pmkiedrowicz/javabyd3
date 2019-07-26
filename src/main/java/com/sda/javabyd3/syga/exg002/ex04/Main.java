package com.sda.javabyd3.syga.exg002.ex04;

public class Main {
    public static void main(String[] args) {
        int[] array1 = {1,4,5};
        int[] array2 = {1,4,5};
        int[] array3 = {2,2,3,4,5,6};

        EqualsArray equalsArray = new EqualsArray();
        System.out.println(equalsArray.equals(array1, array2));
        System.out.println(equalsArray.equals(array2, array3));

    }
}

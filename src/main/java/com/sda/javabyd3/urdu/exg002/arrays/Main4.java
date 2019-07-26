package com.sda.javabyd3.urdu.exg002.arrays;

public class Main4 {
    public static void main(String[] args) {

        int numbers[] = {1, 2, 4, 5, 6, 7, 10};
        int numbers2[] = {1, 2, 3, 5, 6, 7, 9};
        int numbers3[] = {1, 2, 4, 5, 6, 7, 10};

        System.out.println(equals(numbers,numbers2)? "Tablice 1 i 2 są identyczne ": "Tablice 1 i 2 nie są identyczne");
        System.out.println(equals(numbers,numbers3)? "Tablice 1 i 3 są identyczne ": "Tablice 1 i 3 nie są identyczne");


    }

    public static boolean equals(int[] array1, int[] array2) {
        boolean is = true;

        if (array1.length == array2.length) {
            for (int i = 0; i < array1.length; i++) {

                if (array1[i] == array2[i]) {
                    is = true;
                } else {
                    is = false;
                }
            }
        } else {
            is = false;
        }
        return is;
    }

}

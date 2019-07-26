package com.sda.javabyd3.toki.exg002array.ex05;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array={1,2,3,4,5,6};

        ArrayCopier arrayCopier=new ArrayCopier();
        System.out.println(Arrays.toString
                (arrayCopier.copyArray(array)));
    }
}

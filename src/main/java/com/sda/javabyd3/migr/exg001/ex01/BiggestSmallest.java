package com.sda.javabyd3.migr.exg001.ex01;

public class BiggestSmallest {

    public static void bigestSmallest(int num1, int num2, int num3){

        int max = num1;
        if ( max < num2 ) {
            max  = num2;
        }
        if ( max < num3  ) {
            max = num3;
        }
        int min = num1;
        if ( min > num2 ){
            min = num2;
        }
        if ( min > num3 ){
            min = num3;
        }
        System.out.println();
        System.out.println("najwieksza: " + max);
        System.out.println("najmniejsza: " + min);
    }



    }


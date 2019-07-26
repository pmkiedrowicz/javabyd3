package com.sda.javabyd3.syga.exg014.ex02;

public class SumRecursion {
    public static int sumRecursion(int n){
        if(n>0){
            return n + sumRecursion(n-1);
        }else{
            return 0;
        }
    }
}

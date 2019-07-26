package com.sda.javabyd3.jaja.exg014.ex02;

public class SumIntegers {
    public Integer sumInteger(int n){
        if (n >0){
            return n + sumInteger(n-1);
        }else return 0;
    }
}

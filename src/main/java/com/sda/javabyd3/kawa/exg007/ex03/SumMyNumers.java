package com.sda.javabyd3.kawa.exg007.ex03;

public class SumMyNumers {
    public int summingMyNumbers(int... args) {
        int result = 0;
        for (int i = 0; i < args.length; i++) {
            result += args[i];
        }
        return result;
    }
}

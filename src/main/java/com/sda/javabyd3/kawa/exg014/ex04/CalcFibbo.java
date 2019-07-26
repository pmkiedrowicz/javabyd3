package com.sda.javabyd3.kawa.exg014.ex04;

public class CalcFibbo {

    public int calculatinFibboWithRecursion(int arg) {
        if (arg < 2) {
            return arg;
        } else {
            return calculatinFibboWithRecursion(arg - 1) + calculatinFibboWithRecursion(arg - 2);
        }

    }

    public int callculatinFibboWithoutRecursion(int arg) {
        int result = 0;
        int first = 0;
        int second = 1;
        if (arg<2){
            return arg;
        }else {
            for (int i = 2; i <=arg ; i++) {
                result = first + second;
                first = second;
                second = result;
            }
            return result;
        }


    }
}

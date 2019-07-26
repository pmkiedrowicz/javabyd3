package com.sda.javabyd3.mizi.exg014.ex02;

/**
 * Created by Michal Ziolecki.
 */
public class SumCalculator {
    public int sum(int n){
        int sumOfNumber = 0;
        for (int i = n; i > 0; i--){
            sumOfNumber += i;
        }
        return sumOfNumber;
    }

    public int sumWithRecursion(int n){
        if(n>0) n += sumWithRecursion( n-1 );

        return n;
    }
}

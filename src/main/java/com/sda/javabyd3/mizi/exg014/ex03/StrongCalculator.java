package com.sda.javabyd3.mizi.exg014.ex03;

/**
 * Created by Michal Ziolecki.
 */
public class StrongCalculator {
    public int strong(int n){
        int sumOfNumber = 1;
        for (int i = n; i > 0; i--){
            sumOfNumber *= i;
        }
        return sumOfNumber;
    }

    public int strongWithRecursion(int n){
        if(n > 1) n *= strongWithRecursion(n-1 );

        return n;
    }
}

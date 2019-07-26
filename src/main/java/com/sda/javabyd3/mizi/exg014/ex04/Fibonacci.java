package com.sda.javabyd3.mizi.exg014.ex04;

/**
 * Created by Michal Ziolecki.
 */
public class Fibonacci {
    public long FibonacciAlgorithm(int n){
        long penultimate = 0;
        long last = 1;
        long newNumber = 1;
        if(n == 0) return penultimate;
        else if(n == 1) return last;
        else{
            for(int i = 2; i <=n; i++){
                newNumber = last + penultimate;
                penultimate = last;
                last = newNumber;
            }
        }
        return newNumber;
    }

    public long FibonacciAlgorithmWithRecursion(int n){
        long penultimate = 0;
        long last = 1;
        long newNumber;
        if(n == 0) return penultimate;
        else if(n == 1) return last;
        newNumber = FibonacciAlgorithmWithRecursion( n-1 )+ FibonacciAlgorithmWithRecursion( n-2 );

        return newNumber;
    }
}

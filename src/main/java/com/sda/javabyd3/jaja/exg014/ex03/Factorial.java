package com.sda.javabyd3.jaja.exg014.ex03;
/**
 *
 */
public class Factorial {
    /**
     *Calculates factorial value using recursion.
     * @param n
     * @return
     */
    public long calculate(long n){
     if (n ==0){
         return 1;
     }else
         return n * calculate(n-1);
    }
    /**
     * Calculates factorial value using loop.
     * @param n
     * @return
     */
    public long calculateUsingForLoop(long n) {
        if (n ==0)
            return 1;
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }return result;
    }
}

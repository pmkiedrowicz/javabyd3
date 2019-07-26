package com.sda.javabyd3.daol.exg014.ex03;

/**
 *
 */
public class Factorial {

    /**
     * Calculate factorial value using recursion.
     * @param n
     * @return
     */
    long calculate(long n) {
        if (n == 0) {
            return 1;
        } else {
            return n * calculate(n - 1);
        }

    }

    /**
     * Calculate factorial value using loop
     * @param n
     * @return
     */
    public long calculateUsingForLoop(long n) {
        if (n == 0)
            return 1;
        long result = 1;
        for (long i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}


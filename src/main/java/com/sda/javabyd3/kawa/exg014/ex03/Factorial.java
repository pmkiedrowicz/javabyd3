package com.sda.javabyd3.kawa.exg014.ex03;

/**
 *
 */
public class Factorial {

    /**
     * Calculates factorial value using reccurency
     * @param n
     * @return
     */
    public long calculate(long n) {
        if (n == 0) {
            return 1;
        } else {
            return n * calculate(n - 1);
        }
    }

    /**
     * Calculating factorial value using lopop
     * @param n
     * @return
     */
    public long calculateUsingFor(long n) {
        if (n == 0) return 1;
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}

package com.sda.javabyd3.migr.exg014.ex03;

public class Factorial {

    /**
     * calculate factorial using recurency
     *
     * @param n
     * @return
     */

    public int calculate(int n) {
        if (n == 0) {
            return 1;
        } else return n * calculate(n - 1);
    }



    /**
     * calculate factorial using loop
     *
     * @param n
     * @return
     */

    public int calculateUsingForLoop(int n) {
        if (n == 0)
            return 1;
        int result = 1;
        for (int i = 0; i <n; i++) {
            result *= i;
        } return result;

    }}

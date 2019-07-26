package com.sda.javabyd3.mabr.zadania003;

public class PrimeChecker {

    public boolean Prime(int i) {
        int factors = 0;
        int j = 1;

        while (j <= i) {
            if (i % j == 0) {
                factors++;
            }
            j++;
        }
        return (factors == 2);
    }
}

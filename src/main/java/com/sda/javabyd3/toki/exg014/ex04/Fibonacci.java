package com.sda.javabyd3.toki.exg014.ex04;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Fibonacci {

    public int fibbonaci(int n) {
        if (n < 3)
            return 1;
        return fibbonaci(n - 2) + fibbonaci(n - 1);
    }

}

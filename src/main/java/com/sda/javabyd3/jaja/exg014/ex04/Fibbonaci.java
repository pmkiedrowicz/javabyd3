package com.sda.javabyd3.jaja.exg014.ex04;

public class Fibbonaci {

    public int fibo(int n) {
        if (n < 3)
            return 1;
        return fibo(n - 2) + fibo(n - 1);
    }
}

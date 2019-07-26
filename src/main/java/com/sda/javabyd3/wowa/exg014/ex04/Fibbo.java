//Napisz program, który oblicza n-ty wyraz ciągu Fibbonaciego za pomocą rekurencji.
//Napisz również program bez rekurencji i porównaj czas wykonania.

package com.sda.javabyd3.wowa.exg014.ex04;

public class Fibbo {

    public int FibboRecurr(int n) {
        if (2 > n) {
            return n;
        } else {
            return FibboRecurr(n - 1) + FibboRecurr(n - 2);
        }
    }

    public int FibboIter(int n) {
        int elem1 = 0;
        int elem2 = 1;
        int result = 0;

        if (2 > n) {
            return n;
        } else {
            for (int i = 2; i <= n; i++) {
                result = elem1 + elem2;
                elem1 = elem2;
                elem2 = result;
            }
            return result;
        }
    }
}

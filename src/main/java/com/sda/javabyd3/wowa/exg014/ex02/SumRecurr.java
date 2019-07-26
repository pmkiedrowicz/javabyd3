//Napisz, program, który dla podanej liczby całkowitej n oblicza sumę wyrazów od 0-n
//za pomocą rekurencji. Napisz również program bez rekurencji i porównaj czas
//wykonania.

package com.sda.javabyd3.wowa.exg014.ex02;

public class SumRecurr {
    public int sumRecurr(int howManyInts) {
        if (howManyInts > 0) {
            return howManyInts + sumRecurr(howManyInts - 1);
        } else
            return 0;
    }

    public int sumIter(int howManyInts) {
        int sum = 0;
        for (int i = howManyInts; i > 0; i--) {
            sum = sum + i;
        }
        return sum;
    }
}

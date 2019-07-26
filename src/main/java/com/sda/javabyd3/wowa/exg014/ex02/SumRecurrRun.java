//Napisz, program, który dla podanej liczby całkowitej n oblicza sumę wyrazów od 0-n
//za pomocą rekurencji. Napisz również program bez rekurencji i porównaj czas
//wykonania.

package com.sda.javabyd3.wowa.exg014.ex02;

import java.util.Scanner;

public class SumRecurrRun {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("enter n to count sum from 0-n: ");
        int result = sc.nextInt();

        SumRecurr sr = new SumRecurr();

        System.out.println("WITH RECURRENCE: ");
        long timeOfRecurr = System.nanoTime();
        int recurr = sr.sumRecurr(result);
        System.out.println("sum for 0-n: " + recurr);
        timeOfRecurr = System.nanoTime() - timeOfRecurr;
        System.out.println("adding with recurr time: " + timeOfRecurr);

        System.out.println("WITH ITERATION: ");
        long timeOfIter = System.nanoTime();
        int iter = sr.sumIter(result);
        System.out.println("sum for 0-n: " + iter);
        timeOfIter = System.nanoTime() - timeOfIter;
        System.out.println("adding with iter time: " + timeOfIter);

        sc.close();
    }
}

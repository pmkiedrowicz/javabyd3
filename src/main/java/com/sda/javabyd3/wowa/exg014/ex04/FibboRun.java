//Napisz program, który oblicza n-ty wyraz ciągu Fibbonaciego za pomocą rekurencji.
//Napisz również program bez rekurencji i porównaj czas wykonania.

package com.sda.javabyd3.wowa.exg014.ex04;

import java.util.Scanner;

public class FibboRun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Which number on Fibbo-stream you want to get?: ");
        int fibboNumb = sc.nextInt();

        Fibbo f = new Fibbo();

        System.out.println("WITH RECURRENCE: ");
        long timeOfRecurr = System.nanoTime();
        System.out.println(f.FibboRecurr(fibboNumb));
        timeOfRecurr = System.nanoTime() - timeOfRecurr;
        System.out.println("fibbo with recurr time: " + timeOfRecurr);

        System.out.println("WITH ITERATION: ");
        long timeOfIter = System.nanoTime();
        System.out.println(f.FibboIter(fibboNumb));
        timeOfIter = System.nanoTime() - timeOfIter;
        System.out.println("adding with iter time: " + timeOfIter);

        sc.close();
    }
}

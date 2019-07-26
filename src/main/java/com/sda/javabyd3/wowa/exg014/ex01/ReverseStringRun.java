//Napisz program, który tworzy z podanego wyrazu lub zdania wyraz lub zdanie
//odwrotne czyli czytany wspak za pomocą rekurencji. Napisz również program bez
//rekurencji i porównaj czas wykonania.

package com.sda.javabyd3.wowa.exg014.ex01;

import java.util.Scanner;

public class ReverseStringRun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter string to reverse: ");
        String string = sc.nextLine();

        ReverseString rs = new ReverseString();

        System.out.println("WITH RECURRENCE: ");
        long timeOfRecurr = System.nanoTime();
        String reversedString = rs.reverseStringRec(string, string.length() - 1);
        System.out.println("string reversed with recurr: " + reversedString);
        timeOfRecurr = System.nanoTime() - timeOfRecurr;
        System.out.println("reversing with recurr time: " + timeOfRecurr);

        System.out.println("WITH ITERATION: ");
        long timeOfIter = System.nanoTime();
        String reversedString2 = rs.reverseStringIter(string);
        System.out.println("string reversed with iter: " + reversedString2);
        timeOfIter = System.nanoTime() - timeOfIter;
        System.out.println("reversing with iter time: " + timeOfIter);

        sc.close();
    }
}

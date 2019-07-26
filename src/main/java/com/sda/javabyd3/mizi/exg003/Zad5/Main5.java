package com.sda.javabyd3.mizi.exg003.Zad5;

/**
 * Created by Michal Ziolecki.
 */
public class Main5 {

    public static void main(String[] args) {
        Zad5 zad5 = new Zad5();
        System.out.println("Check first palindrome: " + zad5.checkPalindrome( "abcdcba" ));
        System.out.println("Check second palindrome: "
                + zad5.checkPalindrome( "Może jutro ta dama da tortu jeżom" ));
    }
}

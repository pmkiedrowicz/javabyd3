package com.sda.javabyd3.migr.exg002.ex05;

public class PalindromeChecker {

    String x ;
    public  boolean isPalindrome(String str) {
        x = str;
        x = x.toLowerCase();

        return x.equals(new StringBuilder(x).reverse().toString());

    }
}

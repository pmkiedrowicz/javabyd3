package com.sda.javabyd3.lusi.exg003.ex05;

import com.sda.javabyd3.lusi.exg003.ex03.Reverse;
import com.sda.javabyd3.lusi.exg003.ex03.ReverseImpl;

public class Main {

    public static void main(String[] args) {
        String text = "lskkdkdkdk";
        Reverse reverse = new ReverseImpl();
        PalindromChecker palindromChecker = new PalindromChecker(reverse);
        palindromChecker.isPalindrom(text);
    }
}

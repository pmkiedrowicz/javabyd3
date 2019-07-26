package com.sda.javabyd3.daol.exg014.ex01;

public class Backwards {
     static String backwards(String word, int lenght) {
        if (lenght >= 0) {
            return word.charAt(lenght) + backwards(word, lenght - 1);
        }
        return "";
    }
}


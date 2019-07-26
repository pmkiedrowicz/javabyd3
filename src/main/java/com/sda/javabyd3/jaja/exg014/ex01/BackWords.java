package com.sda.javabyd3.jaja.exg014.ex01;

public class BackWords {

    public String backword(String word, int length) {
        if (length >= 0) {
            return word.charAt(length) + backword(word, length - 1);
        }return "";
    }
}

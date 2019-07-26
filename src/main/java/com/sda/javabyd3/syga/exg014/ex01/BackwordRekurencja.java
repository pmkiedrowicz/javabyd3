package com.sda.javabyd3.syga.exg014.ex01;

public class BackwordRekurencja {

    public static String backwords(String word, int length){
        if (length >= 0) {
            return word.charAt(length) + backwords(word, length-1);
        }
        return "";
    }
}

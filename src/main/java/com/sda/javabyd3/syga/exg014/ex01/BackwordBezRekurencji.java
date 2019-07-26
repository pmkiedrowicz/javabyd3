package com.sda.javabyd3.syga.exg014.ex01;

public class BackwordBezRekurencji {

    public static String backword(String word, int lenght){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = lenght-1; i >= 0; i--) {
            stringBuilder.append(word.charAt(i));
        }
        return stringBuilder.toString();
    }
}

package com.sda.javabyd3.jaja.exg003.ex04;


public class DeletePolishChar {

    public String deleteChar(String word) {
        word = word.replace("ą", "a");
        word = word.replace("ę", "e");
        word = word.replace("ć", "c");
        word = word.replace("ń", "n");
        word = word.replace("ł", "l");
        word = word.replace("ź", "z");
        word = word.replace("ż", "z");
        word = word.replace("ó", "o");
        word = word.replace("ś", "s");
        return word;

    }
}

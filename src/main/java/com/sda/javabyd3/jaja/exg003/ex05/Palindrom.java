package com.sda.javabyd3.jaja.exg003.ex05;

import com.sda.javabyd3.jaja.exg003.ex03.ReversWord;

public class Palindrom {

    public String deleteEmpytChar(String text){
        text = text.replaceAll("\\s","").toLowerCase();
        String text2 = text;
        return text2;
    }

    public boolean isPalindrom(String text) {
        ReversWord reversWord = new ReversWord();
        String text2 = reversWord.wordInvers(text);
        if (text2.equals(text)) {
            return true;
        }else return false;
    }
}



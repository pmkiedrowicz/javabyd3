package com.sda.javabyd3.daol.exg003.ex03;

public class InversChecker {
    public String wordInvers (String word) {
        String word2 = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            word2 = word2 + word.charAt(i);
        }
        return word2;
    }
}

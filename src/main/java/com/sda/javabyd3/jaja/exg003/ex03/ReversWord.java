package com.sda.javabyd3.jaja.exg003.ex03;

public class ReversWord {

    public String wordInvers(String word) {
        String word2 = "";
        for (int i = word.length()-1; i >= 0; i--) {
         //   System.out.print(word.charAt(i));
          word2 = word2 + word.charAt(i);
        } return word2;
    }
}
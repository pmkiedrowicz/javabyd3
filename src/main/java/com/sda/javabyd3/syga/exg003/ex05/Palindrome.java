package com.sda.javabyd3.syga.exg003.ex05;

import com.sda.javabyd3.syga.exg003.ex03.Reverse;

public class Palindrome {
    public Boolean palindromeText(String text){
        Reverse reverse = new Reverse();
        String textReverse = null;

        text = text.replace(" ","").toLowerCase();
        textReverse = reverse.textReverse(text);

        if (text.equals(textReverse)){
            System.out.println("Tekst jest palindromem");
            return true;
        }else {
            System.out.println("Tekst nie jest palindromem");
            return false;
        }

    }
}

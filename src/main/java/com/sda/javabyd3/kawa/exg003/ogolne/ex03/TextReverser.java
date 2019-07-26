package com.sda.javabyd3.kawa.exg003.ogolne.ex03;

public class TextReverser {

    public String reversingText(String arg) {
        String reversedText = "";
        for (int i = arg.length() -1 ; i >= 0; i--) {
            reversedText += arg.charAt(i);
        }
        return reversedText;
    }
}

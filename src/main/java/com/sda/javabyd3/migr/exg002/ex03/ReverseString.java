package com.sda.javabyd3.migr.exg002.ex03;

public class ReverseString {

    String reversedString = "";

    public String reverseString(String text) {
        for (int i = text.length() - 1; i >= 0; i--) {
            reversedString += text.charAt(i);
        }
        return reversedString;
    }

    ;

}

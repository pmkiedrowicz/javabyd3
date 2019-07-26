package com.sda.javabyd3.wowa.exg014.ex01;

public class ReverseString {
    public String reverseStringRec(String string, int stringLength) {
        if (stringLength >= 0) {
            return string.charAt(stringLength) + reverseStringRec(string, stringLength - 1);
        }
        return "";
    }

    public String reverseStringIter(String string) {
        String reversedString = "";
        for (int i = string.length() - 1; i >= 0; i--) {
            reversedString += string.charAt(i);
        }
        return reversedString;
    }
}

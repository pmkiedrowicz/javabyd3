package com.sda.javabyd3.kawa.exg014.ex01;

public class WordsReverser {

    public String reversingWords(String arg, int length) {
        if (length >= 0) {
            return arg.charAt(length) + reversingWords(arg, length - 1);
        }
        return "";
    }

    public String reversingWordsOtherMethod (String words, int length){
        String reversedWords = "";
        for (int i = length; i >= 0; i--){
            reversedWords = reversedWords + words.charAt(i);
        }
        return reversedWords;
    }
}

package com.sda.javabyd3.toki.exg003general.general.ex03;

public class Reverser {
    public String textToReverse(String text) {

        text = new StringBuffer(text).reverse().toString();
        if (text != null) {
            System.out.println(text);
        } else {
            String isWrong = "Theres no text here.";
            System.out.println("Theres no text here.");
            return isWrong;
        }
        return text;
    }
}
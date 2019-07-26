package com.sda.javabyd3.toki.exg014.ex01;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Backwarder {

    public String backwards(String word, int length) {
        if (length>=0) {
        return word.charAt(length)+backwards(word, length-1);
        }
        return "";
    }
}

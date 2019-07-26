package com.sda.javabyd3.jaja.exg003.ex04;

import java.util.HashMap;
import java.util.Map;

public class DeletePolishChar2 {

    public String deletePolishChar2(String text) {
        Map<Character, Character> words = new HashMap<Character, Character>();
        words.put('ą', 'a');
        words.put('ę', 'e');
        words.put('ć', 'c');
        words.put('ó', 'o');
        words.put('ł', 'l');
        words.put('ź', 'z');
        words.put('ż', 'z');
        words.put('ń', 'n');
        words.put('ś', 's');

        for (int i = 0; i < text.length(); i++) {
            if (words.containsKey(text.charAt(i))) {
                text = text.replace(text.charAt(i), words.get(text.charAt(i)));
            }
        } return text;
    }
}
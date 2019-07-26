package com.sda.javabyd3.urdu.exg003zadaniaOgolne;

import java.util.HashMap;

public class ChangePolishCharStringBuilder {

    HashMap<Character, Character> polishChar = new HashMap<>();

    public ChangePolishCharStringBuilder() {
        polishChar.put('ą', 'a');
        polishChar.put('ę', 'e');
        polishChar.put('ś', 's');
        polishChar.put('ć', 'c');
        polishChar.put('ź', 'z');
        polishChar.put('ż', 'z');
        polishChar.put('ł', 'l');
        polishChar.put('ó', 'o');
        polishChar.put('ń', 'n');
    }

    public String notPlChar(String text) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            Character character = text.charAt(i);
            result.append(polishChar.containsKey(character) ?
                    (polishChar.get(character)) :
                    (character));
        }
        return result.toString();
    }
}

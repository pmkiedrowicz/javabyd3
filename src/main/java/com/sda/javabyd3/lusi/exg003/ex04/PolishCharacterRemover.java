package com.sda.javabyd3.lusi.exg003.ex04;

import java.util.HashMap;

import static org.apache.commons.lang3.StringUtils.stripAccents;

public class PolishCharacterRemover {

    HashMap<Character, Character> map = new HashMap<Character, Character>() {{
        put('Ł', 'L');
        put('ł', 'l');
        put('ą', 'a');
        put('Ą', 'A');
        put('ę', 'e');
        put('Ę', 'E');
        put('ś', 's');
        put('Ś', 'S');
        put('ć', 'c');
        put('Ć', 'C');
        put('ź', 'z');
        put('ż', 'z');
        put('Ź', 'Z');
        put('Ż', 'Z');
        put('ń', 'n');
        put('Ń', 'N');
        put('Ó', 'O');
        put('ó', 'o');
    }};

    public String remove(String text) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            Character character = text.charAt(i);
            result.append(map.containsKey(character) ?
                    map.get(character) : character);
        }
        return result.toString();
    }

    public String remove2(String text) {
        String result = text;
        for (int i = 0; i < result.length(); i++) {
            if (map.containsKey(result.charAt(i))) {
                result = result.replace(result.charAt(i), map.get(result.charAt(i)));
            }
        }
        return result;
    }

    public String remove3(String text) {
        return stripAccents(text).replace('ł', 'l').replace('Ł', 'L');
    }
}

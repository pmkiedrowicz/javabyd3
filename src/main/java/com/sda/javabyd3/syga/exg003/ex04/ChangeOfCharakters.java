package com.sda.javabyd3.syga.exg003.ex04;

import java.util.HashMap;

public class ChangeOfCharakters {
    public String changeCharakters(String textInPut) {
        HashMap<Character, Character> polishCharacter = new HashMap<>();

        polishCharacter.put('ą', 'a');
        polishCharacter.put('ę', 'e');
        polishCharacter.put('ś', 's');
        polishCharacter.put('ć', 'c');
        polishCharacter.put('ź', 'z');
        polishCharacter.put('ż', 'z');
        polishCharacter.put('ł', 'l');
        polishCharacter.put('ó', 'o');
        polishCharacter.put('ń', 'n');
        polishCharacter.put('Ą', 'A');
        polishCharacter.put('Ę', 'E');
        polishCharacter.put('Ś', 'S');
        polishCharacter.put('Ć', 'C');
        polishCharacter.put('Ź', 'Z');
        polishCharacter.put('Ż', 'Z');
        polishCharacter.put('Ł', 'L');
        polishCharacter.put('Ó', 'O');
        polishCharacter.put('Ń', 'N');

        for (int i = 0; i < textInPut.length(); i++) {
            if (polishCharacter.containsKey(textInPut.charAt(i)) == true) {
                textInPut = textInPut.replace(textInPut.charAt(i), polishCharacter.get(textInPut.charAt(i)));

            }
        }
        System.out.println(textInPut);
        return textInPut;
    }
}

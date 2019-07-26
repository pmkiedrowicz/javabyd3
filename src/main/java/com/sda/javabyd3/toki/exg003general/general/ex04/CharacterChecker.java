package com.sda.javabyd3.toki.exg003general.general.ex04;

import java.util.HashMap;

public class CharacterChecker {
    public String changeCharacter(String inPut) {

        HashMap<Character, Character> polishChar = new HashMap<>();
        polishChar.put('Ł', 'L');
        polishChar.put('ł', 'l');
        polishChar.put('ą', 'a');
        polishChar.put('Ą', 'A');
        polishChar.put('ę', 'e');
        polishChar.put('Ę', 'E');
        polishChar.put('ś', 's');
        polishChar.put('Ś', 'S');
        polishChar.put('ć', 'c');
        polishChar.put('Ć', 'C');
        polishChar.put('ź', 'z');
        polishChar.put('ż', 'z');
        polishChar.put('Ź', 'Z');
        polishChar.put('Ż', 'Z');
        polishChar.put('ń', 'n');
        polishChar.put('Ń', 'N');
        polishChar.put('Ó', 'O');
        polishChar.put('ó', 'o');

        for (int i = 0; i < inPut.length(); i++) {
            if (polishChar.containsKey(inPut.charAt(i)) == true) {
                inPut = inPut.replace(inPut.charAt(i), polishChar.get(inPut.charAt(i)));
            }
        }
        System.out.println(inPut);
        return inPut;
    }
}
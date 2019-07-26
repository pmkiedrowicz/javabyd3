package com.sda.javabyd3.urdu.exg003zadaniaOgolne;

import java.util.HashMap;

public class ChangePolishChar {

    public String notPlChar(String text){
        String result = text;
        HashMap<Character,Character> polishChar = new HashMap<>();

        polishChar.put('ą','a');
        polishChar.put('ę','e');
        polishChar.put('ś','s');
        polishChar.put('ć','c');
        polishChar.put('ź','z');
        polishChar.put('ż','z');
        polishChar.put('ł','l');
        polishChar.put('ó','o');
        polishChar.put('ń','n');

        for(int i=0;i<text.length();i++){
           if(polishChar.containsKey(text.charAt(i))){
             result=result.replace(result.charAt(i), polishChar.get(result.charAt(i)));
           }
        }

        return result;
    }
}

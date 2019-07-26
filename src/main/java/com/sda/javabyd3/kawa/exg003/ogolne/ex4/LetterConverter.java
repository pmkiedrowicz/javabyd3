package com.sda.javabyd3.kawa.exg003.ogolne.ex4;

import java.util.HashMap;

public class LetterConverter {



    public String convertingSomeLetters(String args) {

        //String newSentence = null;
        HashMap<Character,Character> polishChar = new HashMap<Character, Character>(){{
                put('ą', 'a');
                put('ę', 'e');
                put('ś', 's');
                put('ć', 'c');
                put('ź', 'z');
                put('ż', 'z');
                put('ł', 'l');
                put('ó', 'o');
                put('ń', 'n');
            }};
        for(int i = 0; i < args.length(); i ++)
        {
            if(polishChar.containsKey(args.charAt(i)))
            {
                args = args.replace( args.charAt( i ), polishChar.get( args.charAt( i ) ) );
            }
        }
        return args;
    }
}

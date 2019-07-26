package com.sda.javabyd3.mizi.exg003.ex04;

import java.util.HashMap;

/**
 * Created by Michal Ziolecki.
 */
public class Zad4v2 {

    public String changeCharacters(String inPut)
    {
        //String newSentence = null;
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

        for(int i = 0; i < inPut.length(); i ++)
        {
            if( polishChar.containsKey( inPut.charAt( i ) ) == true)
            {
                inPut = inPut.replace( inPut.charAt( i ), polishChar.get( inPut.charAt( i ) ) );
            }
        }

        return inPut;
    }
}

package com.sda.javabyd3.mizi.exg003.ex04;

/**
 * Created by Michal Ziolecki.
 */
public class Zad4 {

    public String toEngCharacters(String inPut)
    {
        inPut = inPut.replace( "ą", "a" );
        inPut = inPut.replace( "ć", "c" );
        inPut = inPut.replace( "ę", "e" );
        inPut = inPut.replace( "ł", "l" );
        inPut = inPut.replace( "ń", "n" );
        inPut = inPut.replace( "ó", "o" );
        inPut = inPut.replace( "ś", "s" );
        inPut = inPut.replace( "ż", "z" );
        inPut = inPut.replace( "ź", "z" );

        return inPut;
    }
}

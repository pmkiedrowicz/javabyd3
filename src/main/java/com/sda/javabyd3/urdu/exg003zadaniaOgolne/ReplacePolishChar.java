package com.sda.javabyd3.urdu.exg003zadaniaOgolne;

public class ReplacePolishChar {

    public String toEngCharacters(String inPut)

    {
        inPut = inPut.toLowerCase();
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

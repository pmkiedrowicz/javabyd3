package com.sda.javabyd3.daol.exg003.ex04;


public class DiacriticWord {
    public String toEngCharacters(String inPut)
    {
        inPut = inPut.replace( "ą", "a" );
        inPut = inPut.replace( "Ą", "A" );
        inPut = inPut.replace( "ć", "c" );
        inPut = inPut.replace( "Ć", "C" );
        inPut = inPut.replace( "ę", "e" );
        inPut = inPut.replace( "Ę", "E" );
        inPut = inPut.replace( "ł", "l" );
        inPut = inPut.replace( "Ł", "L" );
        inPut = inPut.replace( "ń", "n" );
        inPut = inPut.replace( "Ń", "N" );
        inPut = inPut.replace( "ó", "o" );
        inPut = inPut.replace( "Ó", "O" );
        inPut = inPut.replace( "ś", "s" );
        inPut = inPut.replace( "Ś", "S" );
        inPut = inPut.replace( "ż", "z" );
        inPut = inPut.replace( "Ż", "Z" );
        inPut = inPut.replace( "ź", "z" );
        inPut = inPut.replace( "Ź", "Z" );
        return inPut;
    }
}


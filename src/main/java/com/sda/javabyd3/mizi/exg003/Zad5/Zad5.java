package com.sda.javabyd3.mizi.exg003.Zad5;

/**
 * Created by Michal Ziolecki.
 */
public class Zad5 {

    public boolean checkPalindrome(String inPut){

        boolean test = true;
        int board = 0;
        String halfWord = "";

        inPut = inPut.replaceAll( "\\s", "" );
        inPut = inPut.toUpperCase();

        System.out.println("test: " + inPut);

        if(inPut.length() %2 == 0)
        {
            board = inPut.length()/2;
            for(int i =0; i < board ; i++ )
            {
                halfWord += inPut.charAt( i );
            }
            int j = 0;
            for(int i = inPut.length()-1; i >= board; i--)
            {
                if(halfWord.charAt( j ) != inPut.charAt( i ))
                {
                    test = false;
                    break;
                }
                j++;
            }
        }
        else {
            board = (inPut.length()/2) + 1;
            for(int i =0; i < board ; i++ )
            {
                halfWord += inPut.charAt( i );
            }
            int j = 0;
            for(int i = inPut.length()-1; i > board; i--)
            {
                if(halfWord.charAt( j ) != inPut.charAt( i ))
                {
                    test = false;
                    break;
                }
                j++;
            }
        }

        return test;
    }
}

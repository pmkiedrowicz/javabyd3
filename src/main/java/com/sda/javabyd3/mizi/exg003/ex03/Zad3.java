package com.sda.javabyd3.mizi.exg003.ex03;

import java.util.Scanner;

/**
 * Created by Michal Ziolecki.
 */
public class Zad3 {

    public String reverseString(String sentence)
    {
        //char[] tableOfChar = new char[sentence.length()];
        String reverse = "";
        for(int i = sentence.length() - 1; i >= 0 ; i-- )
        {
            reverse += sentence.charAt( i );
        }
        return reverse;
    }
}

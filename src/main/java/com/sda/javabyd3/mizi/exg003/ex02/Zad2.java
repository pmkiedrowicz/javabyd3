package com.sda.javabyd3.mizi.exg003.ex02;

import java.util.Scanner;

/**
 * Created by Michal Ziolecki.
 */
public class Zad2 {


    public boolean test(int number)
    {
        if( number < 2) return false;
        for( int i = 2 ; i < number ; i ++)
        {
            if( number % i == 0)
            {
                return false;
            }
        }
        return true;
    }
}

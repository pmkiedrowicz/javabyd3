package com.sda.javabyd3.mizi.exg001.Kolekcje;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Michal Ziolecki.
 */
public class Zad2 {
    public static void main(String[] args) {
        Random random = new Random( );
        List<Integer> list = new ArrayList <>(  );

        for(int i =0; i <10; i++)
        {
            list.add( random.nextInt( 100 ) );
        }

        System.out.println("Zawartosc: ");
        for(int i =0; i <10; i++)
        {
            System.out.print(" " + list.get( i ));
        }


    }
}

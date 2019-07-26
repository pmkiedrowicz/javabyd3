package com.sda.javabyd3.mizi.exg001.Ogolne;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

/**
 * Created by Michal Ziolecki.
 */
public class Zad6 {
    public static void main(String[] args) {
        Random random = new Random(  );
        List<Integer> listOfNumbers = new ArrayList <>(  );
        List<Integer> sortedList;
        for(int i =0; i < 1000 ; i++)
        {
            Integer randomResult = random.nextInt( 1001 ) + 1000;
            listOfNumbers.add( randomResult );
        }
        System.out.println("rozmiar listy: " + listOfNumbers.size());

        sortedList = listOfNumbers.stream().sorted((item1,item2) -> item1.compareTo( item2 ))
                .collect( Collectors.toList());
        System.out.println("Najmniejsza liczba " + sortedList.get( 0 ));
        System.out.println("Najwieksza liczba " + sortedList.get( sortedList.size()-1 ));

        /*System.out.println("Zawartosc: ");
        for(Integer item : sortedList)
        {
            System.out.println(" " + item);
        }*/

    }
}

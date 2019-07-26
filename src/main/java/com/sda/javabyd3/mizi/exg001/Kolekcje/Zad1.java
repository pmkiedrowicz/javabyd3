package com.sda.javabyd3.mizi.exg001.Kolekcje;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Michal Ziolecki.
 */
public class Zad1 {
    public static void main(String[] args) {
        List<String> listOfNames = new ArrayList <>(  );
        listOfNames.add( "Michal" );
        listOfNames.add( "Sara" );
        listOfNames.add( "Ela" );
        listOfNames.add( "Ania" );
        listOfNames.add( "Janusz" );
        List<String> sortedList;

       sortedList =  listOfNames.stream().sorted( (item1, item2) -> item1.compareTo( item2 ) )
               .collect( Collectors.toList());
        System.out.println("Posortowana lista: ");
       for( String item : sortedList)
       {
           System.out.println(" " + item);
       }

    }
}

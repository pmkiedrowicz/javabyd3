package com.sda.javabyd3.mizi.exg001.Stream;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Michal Ziolecki.
 */
public class Zad1 {
    public static void main(String[] args) {
        List<String> listOfNames = new ArrayList<>(  );
        listOfNames.add( "Michal" );
        listOfNames.add( "Sara" );
        listOfNames.add( "Ela" );
        listOfNames.add( "Ania" );
        listOfNames.add( "Janusz" );

        listOfNames.stream().map( item -> item.toUpperCase() )
                .forEach( item -> System.out.println(item) );
    }
}

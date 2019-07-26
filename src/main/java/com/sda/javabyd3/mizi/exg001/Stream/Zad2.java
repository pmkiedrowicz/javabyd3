package com.sda.javabyd3.mizi.exg001.Stream;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Michal Ziolecki.
 */
public class Zad2 {
    public static void main(String[] args) {
        List<String> matrix = new ArrayList<>(  );
        matrix.add( "Michal" );
        matrix.add( "Sara" );
        matrix.add( "Ania" );
        matrix.add( "Ela" );
        // wyszukac jana z listy
        matrix.add( "Jan" );
        matrix.add( "Janusz" );
        matrix.add( "Kamil" );
        matrix.add( "Karolina" );
        matrix.add( "Zaneta" );
        matrix.add( "Marcin");

        //alternatywne
        //System.out.println(matrix.stream().filter( item -> item.equals( "Jan" ) ).findFirst());
        matrix.stream().filter( item -> item.equals( "Jan" ) )
                .forEach( item -> System.out.println(item) );
    }
}

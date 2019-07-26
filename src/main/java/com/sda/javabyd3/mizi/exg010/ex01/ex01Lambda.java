package com.sda.javabyd3.mizi.exg010.ex01;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Michal Ziolecki.
 */
public class ex01Lambda {
    public static void main(String[] args) {
        List<String> listOfNames = new ArrayList <>(  );
        listOfNames.add( "name1" );
        listOfNames.add( "name2" );
        listOfNames.add( "name3" );
        listOfNames.add( "name4" );
        listOfNames.add( "name5" );

        listOfNames.forEach( name -> System.out.println(name) );
    }
}

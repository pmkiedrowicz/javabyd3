package com.sda.javabyd3.urdu.exg001.stream;

import java.util.ArrayList;
import java.util.List;

public class Main13 {

    public static void main(String[] args) {

        List<String> listOfNames = new ArrayList();
        listOfNames.add("Marta");
        listOfNames.add("Artur");
        listOfNames.add("Sebastian");
        listOfNames.add("Michał");
        listOfNames.add("Urszula");


        listOfNames.stream().map(name -> name.toUpperCase()).forEach(System.out::println);
    }
}

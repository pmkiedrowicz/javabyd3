package com.sda.javabyd3.urdu.exg001.collections;

import java.util.Set;
import java.util.TreeSet;

public class Main7 {

    public static void main(String[] args) {

        Set<String> listOfNames = new TreeSet<>();

        listOfNames.add("Urszula");
        listOfNames.add("Sebastian");
        listOfNames.add("Michał");
        listOfNames.add("Artur");
        listOfNames.add("Grzegorz");

        System.out.println(listOfNames);

    }
}

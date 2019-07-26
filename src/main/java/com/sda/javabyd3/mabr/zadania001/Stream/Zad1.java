package com.sda.javabyd3.mabr.zadania001.Stream;

import java.util.ArrayList;
import java.util.List;

public class Zad1 {
    public static void main(String[] args) {
        List<String> listOfNames = new ArrayList<>();
        listOfNames.add("Jan");
        listOfNames.add("Anna");
        listOfNames.add("Stefan");
        listOfNames.add("Eryk");
        listOfNames.add("Ewa");
        listOfNames.stream().map(String::toUpperCase).forEach(System.out::println);
    }
}

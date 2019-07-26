package com.sda.javabyd3.mabr.zadania001.kolekcje;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Zad1 {
    public static void main(String[] args) {
        List<String> listOfNames = new ArrayList<>();
        listOfNames.add("Jan");
        listOfNames.add("Anna");
        listOfNames.add("Stefan");
        listOfNames.add("Iwona");
        listOfNames.add("Eryk");
        List<String> sortedList;
        sortedList = listOfNames.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
        System.out.println("Posortowana lista: ");
        for (String item : sortedList) {
            System.out.println(" " + item);
        }
    }
}

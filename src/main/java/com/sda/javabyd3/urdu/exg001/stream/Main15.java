package com.sda.javabyd3.urdu.exg001.stream;

import java.util.ArrayList;
import java.util.List;

public class Main15 {

    public static void main(String[] args) {

        List<String> listOfNames = new ArrayList<>();
        listOfNames.add("Marta");
        listOfNames.add("Alicja");
        listOfNames.add("Michał");
        listOfNames.add("Maciej");
        listOfNames.add("Sebastian");
        listOfNames.add("Urszula");
        listOfNames.add("Jagoda");
        listOfNames.add("Jan");
        listOfNames.add("Adam");
        listOfNames.add("Milena");

        System.out.println("Lista alfabetycznie: ");
        listOfNames.stream().sorted((name1,name2)-> name1.compareTo(name2)).forEach(System.out::println);

        System.out.println("Lista według długości: ");
        listOfNames.stream().sorted((name1, name2) -> ((Integer) name1.length()).compareTo((Integer) name2.length()))
                .forEach(System.out::println);

    }

}

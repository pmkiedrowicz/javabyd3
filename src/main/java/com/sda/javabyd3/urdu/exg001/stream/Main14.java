package com.sda.javabyd3.urdu.exg001.stream;

import java.util.ArrayList;
import java.util.List;

public class Main14 {

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

        listOfNames.stream().filter(name -> name.equals("Jan")).forEach(System.out::println);


    }
}

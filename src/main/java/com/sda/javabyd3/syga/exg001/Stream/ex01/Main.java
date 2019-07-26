package com.sda.javabyd3.syga.exg001.Stream.ex01;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> listOfNames = new ArrayList<>();
        listOfNames.add("Sylwek");
        listOfNames.add("Judyta");
        listOfNames.add("Jan");
        listOfNames.add("Andrzej");
        listOfNames.add("Skwarek");

        listOfNames.stream().map(name -> name.toUpperCase()).forEach(name -> System.out.println(name));
    }
}

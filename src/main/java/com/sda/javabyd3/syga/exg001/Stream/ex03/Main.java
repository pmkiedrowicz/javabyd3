package com.sda.javabyd3.syga.exg001.Stream.ex03;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> listOfNames = new ArrayList<>();

        listOfNames.add("David");
        listOfNames.add("Johnny");
        listOfNames.add("Kevin");
        listOfNames.add("Sylwek");
        listOfNames.add("Grażyna");
        listOfNames.add("Jan");
        listOfNames.add("Henio");
        listOfNames.add("Krzysio");
        listOfNames.add("Zbigniew");
        listOfNames.add("Zenon");
        listOfNames.add("Andrzej");

        listOfNames.stream().sorted((e1, e2) -> e1.compareTo(e2)).forEach(name -> System.out.println(name));
    }
}

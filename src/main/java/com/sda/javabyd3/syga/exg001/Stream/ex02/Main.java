package com.sda.javabyd3.syga.exg001.Stream.ex02;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> listOfNames = new ArrayList<>();
        String name = "Jan";

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

        listOfNames.stream().filter(o -> o.equals(name)).forEach(n -> System.out.println(n));
    }
}

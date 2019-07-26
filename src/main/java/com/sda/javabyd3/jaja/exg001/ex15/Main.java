package com.sda.javabyd3.jaja.exg001.ex15;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<String> names = new LinkedList<>();
        names.add("Jakub");
        names.add("Marek");
        names.add("Adam");
        names.add("Aleksandra");
        names.add("Monika");
        names.add("Karolina");
        names.add("Zygmunt");
        names.add("Przemysław");
        names.add("Mariola");
        names.add("Krystian");
        names.add("Jack");

        names.stream()
                .sorted((n1, n2) -> n1.compareTo(n2))
                .forEach(n -> System.out.println(n));
    }
}

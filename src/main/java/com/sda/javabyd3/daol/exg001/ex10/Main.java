package com.sda.javabyd3.daol.exg001.ex10;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Set<String> names = new HashSet<String>(10);
        names.add("Daria");
        names.add("Marta");
        names.add("Mateusz");
        names.add("Michał");
        names.add("Marek");
        names.add("Daniel");
        names.add("Ewa");
        names.add("Przemek");
        names.add("Darek");
        names.add("Grzegorz");

        System.out.println(names);

    }
}

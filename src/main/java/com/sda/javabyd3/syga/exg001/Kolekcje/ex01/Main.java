package com.sda.javabyd3.syga.exg001.Kolekcje.ex01;

import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<String> setWithNames = new TreeSet<>();
        setWithNames.add("Sylwek");
        setWithNames.add("Judyta");
        setWithNames.add("Arek");
        setWithNames.add("Czarek");
        setWithNames.add("Skwarek");

        System.out.println(setWithNames);
    }
}

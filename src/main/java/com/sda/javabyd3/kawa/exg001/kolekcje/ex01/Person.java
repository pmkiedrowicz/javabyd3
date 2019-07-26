package com.sda.javabyd3.kawa.exg001.kolekcje.ex01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Person {
    List<String> names = new ArrayList<>();

    public void addingToList(String[] name) {
        names.addAll(Arrays.asList(name));
    }

    public void sortingNames(List<String> args) {
        args.stream()
                .sorted()
                .forEach(System.out::println);
    }
}

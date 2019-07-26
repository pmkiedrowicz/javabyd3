package com.sda.javabyd3.kawa.exg001.kolekcje.ex04;

import java.util.Arrays;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        String [] names = {"Karol","Antoni","Lukasz","Tomasz","Henryk","Lucjan","Basia","Kasia","Monika","Marcin",
                "Karol", "Basia"};
        HashSet<String> uniqueN = new HashSet<>(Arrays.asList(names));

        uniqueN.stream().sorted().forEach(System.out::println);
    }
}

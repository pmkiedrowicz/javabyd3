package com.sda.javabyd3.mabr.zadania001.Stream;

import java.util.ArrayList;
import java.util.List;

public class Zad3 {
    public static void main(String[] args) {
        List<String> matrix = new ArrayList<>();
        matrix.add("Jan");
        matrix.add("Anna");
        matrix.add("Stefan");
        matrix.add("Ewa");
        matrix.add("Eryk");
        matrix.add("Irena");
        matrix.add("Jerzy");
        matrix.add("Lidia");
        matrix.add("Tomasz");
        matrix.add("Daria");
        matrix.stream().sorted().forEach(item -> System.out.print(" " + item));
    }
}

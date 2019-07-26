package com.sda.javabyd3.jaja.exg010.ex01;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Jagoda");
        names.add("Jola");
        names.add("Żaneta");
        names.add("Kordian");
        names.add("Leon");

        names.stream().forEach(n -> System.out.println(n));
    }
}

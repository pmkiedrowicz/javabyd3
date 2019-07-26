package com.sda.javabyd3.jaja.exg001.ex14;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Jagoda");
        names.add("Jakub");
        names.add("Janina");
        names.add("Jacek");
        names.add("Jarosław");
        names.add("Jan");
        names.add("Jędrzej");
        names.add("Jolanta");
        names.add("Jowita");
        names.add("Julia");

        names.stream()
                .filter(n -> n.startsWith("J"))
                .filter(n -> n.length() <= 3)
                .forEach(n-> System.out.println(n));
    }
}

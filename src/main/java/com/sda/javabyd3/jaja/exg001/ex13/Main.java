package com.sda.javabyd3.jaja.exg001.ex13;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();
        names.add("Jagoda");
        names.add("Karol");
        names.add("Kamil");
        names.add("Jola");
        names.add("Adam");

        names.stream()
                .map(n -> n.toUpperCase())
                .forEach(n-> System.out.println(n));
    }
}

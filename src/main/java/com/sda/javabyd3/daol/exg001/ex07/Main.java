package com.sda.javabyd3.daol.exg001.ex07;

import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        Set<String> names = new TreeSet<>();
        names.add("Daniel");
        names.add("Ewa");
        names.add("Antoni");
        names.add("Marta");
        names.add("Przemek");
        for (String string : names) {
            System.out.println(string);
        }
    }
}

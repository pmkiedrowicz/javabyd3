package com.sda.javabyd3.daol.exg010.ex01;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> names = new ArrayList<String>() {{
            add("Daniel");
            add("Marta");
            add("Ewa");
            add("Antek");
            add("Przemo");
        }};
        names.stream().forEach(n -> System.out.println(n));
    }
}

package com.sda.javabyd3.daol.exg001.ex13;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Daniel", "Marta", "Trelek", "Przemo", "Ewa");

        names.stream().map(name -> name.toUpperCase())
                .forEach(name -> System.out.println(name + " "));
    }
}

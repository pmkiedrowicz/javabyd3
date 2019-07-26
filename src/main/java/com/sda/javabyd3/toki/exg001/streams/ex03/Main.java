package com.sda.javabyd3.toki.exg001.streams.ex03;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        String[] names = {"Kowal", "Zenek", "Zofia", "Param", "Jan", "Ania", "Asia", "Ketrzyk", "Ola"};

        List<String> streamOfNames = Arrays.stream(names)
                .sorted((e1, e2) -> e1.compareTo(e2))
                .collect(Collectors.toList());

        System.out.println(streamOfNames);


    }
}

package com.sda.javabyd3.toki.exg001.streams.ex01;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        String[] names = {"Jan", "Kowal", "Zenek", "Zofia", "Param"};

        List<String> streamOfNames = Arrays.stream(names)
                .map(item->item.toUpperCase())
                .collect(Collectors.toList());
        for (String each : streamOfNames) {
            System.out.println(each);
        }
    }
}
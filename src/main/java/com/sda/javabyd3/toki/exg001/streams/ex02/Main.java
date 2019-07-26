package com.sda.javabyd3.toki.exg001.streams.ex02;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        //added for reason same names twice to check if it works
        String[] names = {"Kowal", "Zenek", "Zofia", "Param", "Jan", "Kowal", "Zenek", "Zofia", "Param"};

        List<String> streamOfNames = Arrays.stream(names)
                //try with .filter(item->item.matches("Zofia"))
                .filter(item->item.matches("Jan"))
                .collect(Collectors.toList());

        System.out.println(streamOfNames);

    }
}
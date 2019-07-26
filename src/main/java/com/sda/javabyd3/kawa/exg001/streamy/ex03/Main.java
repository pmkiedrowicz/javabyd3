package com.sda.javabyd3.kawa.exg001.streamy.ex03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        String [] names = {"Jan","Lucjan","Gracjan","Janina","Janusz","Patryk","Janek","Janka","Robert","Kasia",
                "Jan","Patryk"};
        List<String> justAListofNames = new ArrayList<>(Arrays.asList(names));

        justAListofNames.stream().sorted().forEach(System.out::println);
    }
}

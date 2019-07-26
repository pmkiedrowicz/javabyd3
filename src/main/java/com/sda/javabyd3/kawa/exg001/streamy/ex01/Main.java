package com.sda.javabyd3.kawa.exg001.streamy.ex01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        String [] names = {"Kasia","Basia","Ola","Patrycja","Monika"};
        List<String> listOfNames = new ArrayList<>(Arrays.asList(names));

        listOfNames.stream().map(String::toUpperCase).forEach(System.out::println);
    }
}

package com.sda.javabyd3.urdu.exg010.ex01;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> listOfNames = new ArrayList<>();
        listOfNames.add("Urszula");
        listOfNames.add("Milena");
        listOfNames.add("Paweł");
        listOfNames.add("Artur");
        listOfNames.add("Wiktoria");


        listOfNames.stream().forEach(name ->System.out.println(name));

    }
}

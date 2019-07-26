package com.sda.javabyd3.syga.exg010.ex01;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> listOfName = new ArrayList<>();
        listOfName.add("Sylwek");
        listOfName.add("Judyta");
        listOfName.add("Arek");
        listOfName.add("Skwarek");
        listOfName.add("Antonio");

        listOfName.forEach((name) -> System.out.println(name));
    }
}

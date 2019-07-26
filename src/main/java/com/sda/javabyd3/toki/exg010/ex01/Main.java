package com.sda.javabyd3.toki.exg010.ex01;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Jan");
        list.add("Ania");
        list.add("Asia");
        list.add("Sonia");
        list.add("Kasia");
        ListOfPerson listOfPerson = new ListOfPerson();
        listOfPerson.returnNames(list);

    }
}

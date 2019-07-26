package com.sda.javabyd3.toki.exg010.ex01;

import java.util.List;
import java.util.Scanner;

public class ListOfPerson {
    public ListOfPerson() {
    }

    public List<String> returnNames(List<String> list) {
        System.out.println("List of added names: ");
        list.stream().forEach(el -> System.out.println(el));
        return list;
    }
}

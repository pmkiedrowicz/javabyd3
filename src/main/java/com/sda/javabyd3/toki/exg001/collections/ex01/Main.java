package com.sda.javabyd3.toki.exg001.collections.ex01;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Jan");
        list.add("Kasia");
        list.add("Zosia");
        list.add("Asia");
        list.add("Zenek");

        list.sort((e1, e2)->e1.compareTo(e2));

        System.out.println(list);
        
    }
}

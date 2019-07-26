package com.sda.javabyd3.kawa.exg010.ex01;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> namesList = new ArrayList<String>(){{
            add("Karol");
            add("Monika");
            add("Lukasz");
            add("Mateusz");
            add("Julia");
        }};

        namesList.stream().forEach(e-> System.out.println(e));
    }
}

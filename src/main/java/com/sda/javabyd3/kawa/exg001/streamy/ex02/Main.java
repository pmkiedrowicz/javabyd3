package com.sda.javabyd3.kawa.exg001.streamy.ex02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String [] names = {"Jan","Lucjan","Gracjan","Janina","Janusz","Patryk","Janek","Janka","Robert","Kasia"};
        List<String> namesList = new ArrayList<>(Arrays.asList(names));

        namesList.stream().filter(element -> element.equals("Jan")).forEach(System.out::println);
    }
}

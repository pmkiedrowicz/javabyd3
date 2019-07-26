package com.sda.javabyd3.kade.exg010.ex01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class zad1 {

    public static void main(String[] args) {

        List<String> listOfNames = new ArrayList<>();
        listOfNames.add("Bobek");
        listOfNames.add("Marian");
        listOfNames.add("Olek");
        listOfNames.add("Kala");
        listOfNames.add("Karolina");

        Arrays.stream(new List[]{listOfNames}).forEach(item -> System.out.println(listOfNames));
        listOfNames.forEach(item -> System.out.println(item));


    }

}

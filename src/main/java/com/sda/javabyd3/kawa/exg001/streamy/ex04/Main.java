package com.sda.javabyd3.kawa.exg001.streamy.ex04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Integer [] someNumbers = {3,5,6,8,124,3555};
        List<Integer> listOfNumbs = new ArrayList<>(Arrays.asList(someNumbers));

        System.out.println("Najwyzsza wartosc to " + listOfNumbs.stream().max(Integer::compare).get());
        System.out.println("Najmniejsza wartosc to " + listOfNumbs.stream().min(Integer::compare).get());
    }
}

package com.sda.javabyd3.syga.exg001.Stream.ex04;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> listOfNumber = new ArrayList<>();
        listOfNumber.add(6);
        listOfNumber.add(33);
        listOfNumber.add(64);
        listOfNumber.add(8);
        listOfNumber.add(2);
        listOfNumber.add(3);

        System.out.println("Max number: " + listOfNumber.stream().max(Integer::compareTo).get());
        System.out.println("Min number: " + listOfNumber.stream().min(Integer::compareTo).get());
    }
}

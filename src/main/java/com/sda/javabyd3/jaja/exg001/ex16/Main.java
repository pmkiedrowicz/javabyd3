package com.sda.javabyd3.jaja.exg001.ex16;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(50);
        numbers.add(150);
        numbers.add(530);
        numbers.add(5);
        numbers.add(512);
        numbers.add(12);

        numbers.stream()
                .sorted((n1, n2) -> n1.compareTo(n2))
                .forEach(n -> System.out.println(n));
        System.out.println("Max = " + numbers.stream().max(Integer::compare).get());
        System.out.println("Min = " + numbers.stream().min(Integer::compare).get());
    }
}

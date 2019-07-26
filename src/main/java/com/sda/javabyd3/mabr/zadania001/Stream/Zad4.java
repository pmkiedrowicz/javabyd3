package com.sda.javabyd3.mabr.zadania001.Stream;

import java.util.ArrayList;
import java.util.List;

public class Zad4 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.stream().sorted().forEach(item -> {
            if (list.indexOf(item) == 0) System.out.println("Najmniejszy element: " + item);
            if (list.indexOf(item) == list.size() - 1) System.out.println("Najwiekszy element: " + item);
        });
    }
}

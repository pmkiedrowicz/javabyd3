//Utwórz kolekcję z 6 liczbami. Korzystając z strumieni znajdź maksymalną i
//minimalną liczbę znajdującą się w kolekcji.

package com.sda.javabyd3.wowa.exg001.Streamy.ex04;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Stream_4 {
    public static void main(String[] args) {

        int numbers[] = {3, 6, -7, 5, 8, 1};
        List<Integer> numbersList = new ArrayList<>();

        for (Integer i : numbers) {
            numbersList.add(i);
        }

        System.out.println(numbersList);

        numbersList.stream()
                .sorted(Comparator.reverseOrder())
                .limit(1)
                .forEach(n -> System.out.println("biggest: " + n));

        numbersList.stream()
                .sorted()
                .limit(1)
                .forEach(n -> System.out.println("smallest: " + n));
    }
}

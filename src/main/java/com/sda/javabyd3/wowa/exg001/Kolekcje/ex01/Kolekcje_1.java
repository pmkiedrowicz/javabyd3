//Dodaj 5 imion do kolekcji. Wybierz tą kolekcję, która posortuje wprowadzone
//wartości. Po dodaniu elementów wyświetl wszystkie.

package com.sda.javabyd3.wowa.exg001.Kolekcje.ex01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Kolekcje_1 {
    public static void main(String[] args) {

        String names[] = {"Barbara", "Maria", "Kaska", "Dorota", "Anna"};
        List<String> list = new ArrayList<>();

        list.addAll(Arrays.asList(names));

//        for (String s : names) {
//            list.add(s);
//        }

        list.stream()
                .sorted()
                .forEach(e -> System.out.print(e + " "));
    }
}

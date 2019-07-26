//Utwórz kolekcję, na następnie dodaj do niej 5 imion. Korzystając z Stream zmodyfikuj
//kolekcję tak, aby imiona były pisane dużymi literami (UPPERCASE), a następnie
//wyświetl wszystkie imiona.

package com.sda.javabyd3.wowa.exg001.Streamy.ex01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Stream_1 {
    public static void main(String[] args) {

        String names[] = {"Ania", "Kasia", "Basia", "Magda", "Wojtek"};
        List<String> namesList = new ArrayList<>(Arrays.asList(names));
        //mozna tak jak wyzej lub -> namesList.addAll(Arrays.asList(names));

        System.out.println(namesList);

        namesList.stream()
                .map(i -> i.toUpperCase())
                .forEach(i -> System.out.print(i + " "));
    }
}

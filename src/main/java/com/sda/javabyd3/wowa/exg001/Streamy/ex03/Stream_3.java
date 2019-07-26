//Utwórz nieposortowaną kolekcję z 10 dowolnymi i unikatowymi imionami.
//Korzystając ze strumieni posortuj kolekcję i wyświetl ją.

package com.sda.javabyd3.wowa.exg001.Streamy.ex03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Stream_3 {
    public static void main(String[] args) {

        String names[] = {"Anna", "Kasia", "Basia", "Janusz", "Jania", "Tomek", "Jan", "Janek", "Bamberiusz", "Janislaw"};
        List<String> namesList = new ArrayList<>(Arrays.asList(names));

        namesList.stream()
                .sorted((n1, n2) -> n1.compareTo(n2))
                .forEach(n1 -> System.out.print(n1 + " "));
    }
}

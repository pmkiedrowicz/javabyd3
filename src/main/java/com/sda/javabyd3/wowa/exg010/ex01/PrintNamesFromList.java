//Utwórz listę List<String> a następnie dodaj 5 imion do kolekcji. Korzystając z metody
//foreach listy oraz wyrażenia lambda wyświetl wszystkie imiona znajdujące się na
//liście.

package com.sda.javabyd3.wowa.exg010.ex01;

import java.util.ArrayList;
import java.util.List;

public class PrintNamesFromList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Wojtek");
        list.add("Marek");
        list.add("Tomek");
        list.add("Ania");
        list.add("Maria");

        list.stream()
                .forEach(i -> System.out.println(i));
    }
}

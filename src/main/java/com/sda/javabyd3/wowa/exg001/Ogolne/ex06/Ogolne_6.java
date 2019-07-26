//Wylosuj 1000 liczb z zakresu 1000-2000 i zapisz je do listy. Skorzystaj z stream() w
//liście do wyszukania najmniejszej i największej wartości.

package com.sda.javabyd3.wowa.exg001.Ogolne.ex06;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class Ogolne_6 {

    public static void bigAndSmall() {
        Random random = new Random();
        ArrayList <Integer> list = new ArrayList<>();

        while (list.size() < 1000) {
            list.add(random.nextInt(1001) + 1000);
        }
        System.out.println("wszystkie wylosowane liczby: \n" + list);

        list.stream()
                .sorted()
                .limit(1)
                .forEach(e -> System.out.println("najmniejsza: " + e));

        list.stream()
                .sorted(Comparator.reverseOrder())
                .limit(1)
                .forEach(e -> System.out.print("najwieksza: " + e));
    }

    public static void main(String[] args) {
        bigAndSmall();
    }
}

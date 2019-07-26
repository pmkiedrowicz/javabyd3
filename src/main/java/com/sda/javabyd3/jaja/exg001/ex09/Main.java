package com.sda.javabyd3.jaja.exg001.ex09;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<Integer, String> mapa = new HashMap<Integer, String>();
        for (int i = 1; i <= 10; i++){
            mapa.put(i, "pacjent nr " + i);
        }
        System.out.println("Pierwsza osoba z kolejki to: " + mapa.get(1));
        System.out.println("Ostatnia osoba z kolejki to: " + mapa.get(10));

        Deque<String> deque = new ArrayDeque<>();
        for (int i = 1; i <= 10; i++) {
            deque.add("pacjent nr " + i);
        }
        System.out.println("Pierwsza osoba z kolejki to: " + deque.getFirst());
        System.out.println("Ostatnia osoba z kolejki to: " + deque.getLast());
    }
}

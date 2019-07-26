package com.sda.javabyd3.mabr.zadania001.kolekcje;

import java.util.LinkedList;
import java.util.Queue;

public class Zad3 {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        for (int i = 1; i < 11; i++) {
            String client = "Id " + i;
            System.out.print(" " + client);
            queue.add(client);
        }
        System.out.println("\n Pierwsza osoba w kolejce: " + queue.element());
        while (true) {
            String element = queue.poll();
            if (queue.isEmpty()) {
                System.out.println("Ostatni element: " + element);
                break;
            }
        }
    }
}

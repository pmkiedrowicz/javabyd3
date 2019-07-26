package com.sda.javabyd3.syga.exg001.Kolekcje.ex05;

import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) {
        Deque<String> queueWithTask = new ArrayDeque<>();

        for (int i = 0; i < 10; i++) {
            queueWithTask.add("Zadanie" + (i+1));
        }

        System.out.println(queueWithTask);
    }
}

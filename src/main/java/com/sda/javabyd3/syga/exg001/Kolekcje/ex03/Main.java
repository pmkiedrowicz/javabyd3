package com.sda.javabyd3.syga.exg001.Kolekcje.ex03;

import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) {
        Deque<String> queueToTheDoctor = new ArrayDeque<>();

        queueToTheDoctor.add("Sylwek");
        queueToTheDoctor.add("Judyta");
        queueToTheDoctor.add("Jan");
        queueToTheDoctor.add("Piotr");
        queueToTheDoctor.add("Kleks");
        queueToTheDoctor.add("Pan Tadeusz");
        queueToTheDoctor.add("Adam");
        queueToTheDoctor.add("Ewa");
        queueToTheDoctor.add("Artur");
        queueToTheDoctor.add("Zbigniew");

        System.out.println(queueToTheDoctor.getFirst());
        System.out.println(queueToTheDoctor.getLast());

    }
}

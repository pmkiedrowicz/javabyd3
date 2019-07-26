package com.sda.javabyd3.kawa.exg001.kolekcje.ex03;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class QueueToDoc {

    Deque<String> listOfPpl = new ArrayDeque<>();

    public void addingPplToQueue(String[] names) {
        listOfPpl.addAll(Arrays.asList(names));
    }

    public void showFirstAndLastInQueue(Deque<String> args) {
        System.out.println("Osoba pierwsza w kolejce to - " + args.getFirst());
        System.out.println("Osoba ostatnia w kolejce to - " + args.getLast());
    }
}

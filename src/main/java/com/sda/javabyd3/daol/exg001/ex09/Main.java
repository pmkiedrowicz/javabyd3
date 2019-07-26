package com.sda.javabyd3.daol.exg001.ex09;

import java.util.ArrayDeque;
import java.util.Deque;

public class Main {

    public static void main(String[] args) {


        Deque<String> peopleToDoctor = new ArrayDeque<String>(10);

        peopleToDoctor.add("Pierwszy Pierwszy");
        peopleToDoctor.add("Drugi Drugi");
        peopleToDoctor.add("Trzeci Trzeci");
        peopleToDoctor.add("Czwarta Czwarty");
        peopleToDoctor.add("Piąta Piąty");
        peopleToDoctor.add("Szósty Sześć");
        peopleToDoctor.add("Siódmy Siedem");
        peopleToDoctor.add("Ósma Osiem");
        peopleToDoctor.add("Dziewiąty Dziewieć");
        peopleToDoctor.add("Dziesiąta Dziesięć");

        System.out.println(peopleToDoctor);
        System.out.println(peopleToDoctor.getFirst());
        System.out.println(peopleToDoctor.getLast());
    }
}

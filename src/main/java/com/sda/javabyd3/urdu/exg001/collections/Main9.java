package com.sda.javabyd3.urdu.exg001.collections;

import java.util.LinkedList;
import java.util.Queue;

public class Main9 {

    public static void main(String[] args) {

        Queue<Person> queueToDoctor = new LinkedList<>();
        Person last = null;
        int sizeOfQueue;
        queueToDoctor.add(new Person("Urszula", "Dutkiewicz"));
        queueToDoctor.add(new Person("Marta", "Dziedzic"));
        queueToDoctor.add(new Person("Michał", "Ulanowski"));
        queueToDoctor.add(new Person("Sebastian", "Hejankowski"));
        queueToDoctor.add(new Person("Artur", "Kowalski"));
        queueToDoctor.add(new Person("Grzegorz", "Nowak"));
        queueToDoctor.add(new Person("Anna", "Kowalewska"));
        queueToDoctor.add(new Person("Adam", "Kus"));
        queueToDoctor.add(new Person("Paweł", "Gaja"));
        queueToDoctor.add(new Person("Alicja", "Wilk"));

        sizeOfQueue = queueToDoctor.size();
        System.out.println("Pierwsza osoba w kolejce do lekarza to: " + queueToDoctor.peek());

        for (int i = 0; i < sizeOfQueue; i++) {

            last = queueToDoctor.poll();
        }
        System.out.println("Ostatnia osoba w kolejce to " + last);

    }
}

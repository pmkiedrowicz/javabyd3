package com.sda.javabyd3.syga.exg001.Stream.ex05;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> listOfPerson = new ArrayList<>();

        Person person = new Person();
        person.name = "Sylwek";
        person.surname = "G";
        person.revard = 2490;
        listOfPerson.add(person);

        for (int i = 1; i < 10; i++) {
            person.name = ("Jan" + i);
            person.surname = ("Kowalski" + i);
            person.revard = (2400 + i*100);
            listOfPerson.add(person);
        }
        System.out.println(listOfPerson);
    }
}

package com.sda.javabyd3.jaja.enums.ex01;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();
        people.add(new Person("Jagoda", "Jarz", EyeColor.brown, Sex.female));
        people.add(new Person("Anna", "Ann", EyeColor.blue, Sex.female));
        people.add(new Person("Karol", "Kar", EyeColor.brown, Sex.male));
        people.add(new Person("Damian", "Dam", EyeColor.green, Sex.male));

        for (Person p : people) {
            System.out.println(p.toString());
        }
    }
}

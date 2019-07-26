package com.sda.javabyd3.migr.enums.ex02;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Person person1 = new Person("Adaś", "NieUmi", EyeColor.sraczkowaty, Gender.Female);
        Person person2 = new Person("Mich", "Grab", EyeColor.niebieski, Gender.Male);

        List<Person> lista = new ArrayList<>();
        lista.add(person2);
        lista.add(person1);

        lista.forEach(System.out::println);

        for(Person a:lista){
        switch (a.getGender()) {

            case Male:

                break;
            case Female:

                break;
        }
    }
}}

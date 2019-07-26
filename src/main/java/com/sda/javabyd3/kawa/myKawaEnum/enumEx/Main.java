package com.sda.javabyd3.kawa.myKawaEnum.enumEx;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Ala", "Kowalska", PersonsSex.Female, ColorOfAnEyes.Blue);
        Person person2 = new Person("Iza", "Twardowska", PersonsSex.Female, ColorOfAnEyes.Brown);
        Person person3 = new Person("Ola", "Bocian", PersonsSex.Female, ColorOfAnEyes.Green);
        Person person4 = new Person("Jacek", "Jackowkski", PersonsSex.Male, ColorOfAnEyes.Blue);
        Person person5 = new Person("Arek", "Arkowski", PersonsSex.Male, ColorOfAnEyes.Brown);

        List<Person> personList = new ArrayList<Person>() {{
            add(person1);
            add(person2);
            add(person3);
            add(person4);
            add(person5);
        }};

        for (Person p : personList) {
            switch (p.getPersonsSex()) {
                case Male:

                    break;
                case Female:

                    break;
            }

        }

        personList.forEach(e -> System.out.println(e));
    }
}

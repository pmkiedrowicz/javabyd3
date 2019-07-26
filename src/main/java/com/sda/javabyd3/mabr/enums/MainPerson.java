package com.sda.javabyd3.mabr.enums;

import java.util.ArrayList;
import java.util.List;

//import static com.sda.java.exercises.Utils.displayTextOnConsole;
import static com.sda.javabyd3.mabr.enums.Utils.displayTextOnConsole;

public class MainPerson {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Jan", "Kowalski", EyeColor.green, Gender.Mezczyzna));
        persons.add(new Person("Anna", "Nowak", EyeColor.brown, Gender.Kobieta));
        persons.add(new Person("Irena", "Kos", EyeColor.blue, Gender.Kobieta));

        for (Person p : persons) {
            switch (p.getGender()) {
                case Mezczyzna:
                    displayTextOnConsole(p.toString(), TextColor.ANSI_YELLOW);
                    break;
                case Kobieta:
                    displayTextOnConsole(p.toString(), TextColor.ANSI_GREEN);
                    break;
            }
        }
    }
}





package com.sda.javabyd3.syga.enums.person;

import com.sda.javabyd3.lusi.introduction.TextColor;
import com.sda.javabyd3.lusi.introduction.Utils;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> listOfPerson = new ArrayList<>();
        listOfPerson.add(new Person("Sylwek", "G", EyesColor.Green, Sex.Male));
        listOfPerson.add(new Person("Judyta", "Amb", EyesColor.Brown, Sex.Female));
        listOfPerson.add(new Person("Andrzej", "Andrzejkowski", EyesColor.Hazel, Sex.Male));
        listOfPerson.add(new Person("Zbigniew", "Zbigniewowski", EyesColor.Amber, Sex.Male));

        int i = 0;
        for (Person person: listOfPerson) {

            switch (person.getSex()) {
                case Male:
                    Utils.displayTextOnConsole("", TextColor.ANSI_GREEN);
                    break;
                case Female:
                    Utils.displayTextOnConsole("", TextColor.ANSI_RED);
                    break;
            }
            System.out.println(listOfPerson.get(i));
            i++;
        }



    }
}

package com.sda.javabyd3.urdu.exEnum.person;

import com.sda.javabyd3.lusi.introduction.TextColor;

import java.util.ArrayList;
import java.util.List;

import static com.sda.javabyd3.lusi.introduction.Utils.displayTextOnConsole;

public class Main {
    public static void main(String[] args) {

        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Urszula", "Dutkiewicz",Sex.Kobieta,EyeColor.Zielony));
        personList.add(new Person("Milena", "Dutkiewicz",Sex.Kobieta,EyeColor.Zielony));
        personList.add(new Person("Adam", "Nowak",Sex.Mężczyzna,EyeColor.Niebieski));
        personList.add(new Person("Paweł", "Mika",Sex.Mężczyzna,EyeColor.Piwny));
        personList.add( new Person("Marta", "Dziedzic",Sex.Kobieta,EyeColor.Szary));

//        for(Person person : personList){
//            System.out.println(person.toString());
//        }
        System.out.println("Kolorami: ");

        for(Person person : personList){
            if(person.sex.isWoman()){
                displayTextOnConsole(person.toString(), TextColor.ANSI_BLUE);
            }
            else displayTextOnConsole(person.toString(), TextColor.ANSI_GREEN);
        }

    }
}

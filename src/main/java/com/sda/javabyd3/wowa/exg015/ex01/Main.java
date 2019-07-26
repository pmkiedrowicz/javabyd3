//Utwórz obiekt Person posiadający pola: name, lastName, eyeColor i sex
//(F,M). Kolor oczu oraz płeć powinna być typu Enum. Utwórz odpowiedni zbiór
//wartości dla koloru oczu oraz płci. Utwórz kilka egzemplarzy obiektu Person i
//dodaj je do listy List<Person>. Wyświetl parametry każdej klasy Person za
//pomocą metody toString().

package com.sda.javabyd3.wowa.exg015.ex01;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Person> listOfPersons = new ArrayList<>();
        listOfPersons.add(new Person("Wojtek", "W", EyeColor.Yellow, Sex.MALE));
        listOfPersons.add(new Person("Marek", "M", EyeColor.Blue, Sex.MALE));
        listOfPersons.add(new Person("Karolina", "K", EyeColor.Yellow, Sex.FEMALE));

        listOfPersons
                .forEach(p -> System.out.println(p));
    }
}

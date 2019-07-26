//Utwórz obiekt Person posiadający pola: name, lastName, eyeColor i sex
//(F,M). Kolor oczu oraz płeć powinna być typu Enum. Utwórz odpowiedni zbiór
//wartości dla koloru oczu oraz płci. Utwórz kilka egzemplarzy obiektu Person i
//dodaj je do listy List<Person>. Wyświetl parametry każdej klasy Person za
//pomocą metody toString().
//Rozwiń poprzednie zadanie i korzystając z pętli switch wyświetl informacje o
//osobie w zależności od płci w innym kolorze. Przykładowo jeśli Person jest
//kobietą to wyświetl w zielonym kolorze, a jeśli mężczyzną to w żółtym
//kolorze.

package com.sda.javabyd3.wowa.exg015.ex02;

import com.sda.javabyd3.wowa.introduction.TextColor;

import java.util.ArrayList;
import java.util.List;

import static com.sda.javabyd3.wowa.introduction.Utils.displayTextOnConsole;

public class Main {
    public static void main(String[] args) {

        List<Person> listOfPersons = new ArrayList<>();
        listOfPersons.add(new Person("Karolina", "W", EyeColor.Yellow, Sex.FEMALE));
        listOfPersons.add(new Person("Tomek", "H", EyeColor.Yellow, Sex.MALE));
        listOfPersons.add(new Person("Magda", "W", EyeColor.Yellow, Sex.FEMALE));
        listOfPersons.add(new Person("Marek", "M", EyeColor.Blue, Sex.MALE));
        listOfPersons.add(new Person("Wojtek", "K", EyeColor.Yellow, Sex.MALE));

        for (Person p : listOfPersons) {
            switch (p.sex) {
                case FEMALE:
                    displayTextOnConsole(p.toString(), TextColor.ANSI_GREEN);
                    break;
                case MALE:
                    displayTextOnConsole(p.toString(), TextColor.ANSI_BLUE);
                    break;
            }
        }
    }
}

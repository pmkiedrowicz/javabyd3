//Utwórz obiekt Person posiadający pola: name, lastName, eyeColor i sex
//(F,M). Kolor oczu oraz płeć powinna być typu Enum. Utwórz odpowiedni zbiór
//wartości dla koloru oczu oraz płci. Utwórz kilka egzemplarzy obiektu Person i
//dodaj je do listy List<Person>. Wyświetl parametry każdej klasy Person za
//pomocą metody toString().
//Rozwiń poprzednie zadanie i korzystając z pętli switch wyświetl informacje o
//osobie w zależności od płci w innym kolorze. Przykładowo jeśli Person jest
//kobietą to wyświetl w zielonym kolorze, a jeśli mężczyzną to w żółtym
//kolorze.
//Rozwiń poprzednie zadania. Korzystając z konstruktora Enum i jego pola
//prywatnego dodaj do Enum Sex wartość tekstową określającą w języku
//polskim płeć (mężczyzna, kobieta). Podczas wyświetlania ToString
//wykorzystaj nowe pole do wyświetlenia płci za pomocą słów "mężczyzna"
//oraz "kobieta" zamiast "F" oraz "M".

package com.sda.javabyd3.wowa.exg015.ex03;

import com.sda.javabyd3.wowa.introduction.TextColor;

import java.util.ArrayList;
import java.util.List;

import static com.sda.javabyd3.wowa.introduction.Utils.displayTextOnConsole;

public class Main {
    public static void main(String[] args) {

        List<Person> listOfP = new ArrayList<>();
        listOfP.add(new Person("Karolina", "W", EyeColor.Yellow, Sex.FEMALE));
        listOfP.add(new Person("Marian", "H", EyeColor.Yellow, Sex.MALE));
        listOfP.add(new Person("Magda", "W", EyeColor.Yellow, Sex.FEMALE));
        listOfP.add(new Person("Marek", "M", EyeColor.Blue, Sex.MALE));
        listOfP.add(new Person("Wojtek", "K", EyeColor.Yellow, Sex.MALE));

        for (Person p : listOfP) {
            switch (p.sex.getPlec()) {
                case "mezczyzna":
                    displayTextOnConsole(p.toString(), TextColor.ANSI_GREEN);
                    break;
                case "kobieta":
                    displayTextOnConsole(p.toString(), TextColor.ANSI_BLUE);
                    break;
            }
        }
    }
}

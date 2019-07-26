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

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter

public class Person {
    String name;
    String lastName;
    EyeColor eyeColor;
    Sex sex;

    @Override
    public String toString() {
        return name + " " + lastName + " " + eyeColor + " " + sex.getPlec();
    }
}

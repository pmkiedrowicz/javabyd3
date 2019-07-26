//Przygotuj program, który pobiera od użytkownika 3 liczby, a następnie wskazuje
//największą oraz najmniejszą z nich. Dodatkowo program oblicza sumę podanych
//liczb.

package com.sda.javabyd3.wowa.exg001.Ogolne.ex01;

public class Ogolne_1 {
    public static void najwiekszaINajmniejsza(int liczba1, int liczba2, int liczba3) {
        int max = liczba1;
        if (liczba2 > max) {
            max = liczba2;
        }
        if (liczba3 > max) {
            max = liczba3;
        }

        int min = liczba1;
        if (liczba2 < min) {
            min = liczba2;
        }
        if (liczba3 < min) {
            min = liczba3;
        }
        System.out.println("najwieksza: " + max);
        System.out.println("najmniejsza: " + min);
    }

    public static int suma(int liczba1, int liczba2, int liczba3) {
        return liczba1 + liczba2 + liczba3;
    }
}

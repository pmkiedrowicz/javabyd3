//Jesteś firmą produkującą tabliczki z imionami. Dla każdego imienia musisz
//przygotować matrycę. Raz przygotowana matryca może być wykorzystywana
//wielokrotnie. Korzystając z odpowiedniej kolekcji dodaj do niej imiona (co najmniej
//10) osób tak aby w kolekcji się nie powtarzały. Podczas dodawania dodaj kilka imion
//powtarzających się.

package com.sda.javabyd3.wowa.exg001.Kolekcje.ex04;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Kolekcje_4 {
    public static void main(String[] args) {

        String names[] = {"Anna", "Kasia", "Basia", "Anna", "Frania", "Tomek", "Marek", "Basia", "Bamberiusz", "Marek"};
        Set<String> uniqueNames = new HashSet<>();
        uniqueNames.addAll(Arrays.asList(names));

        System.out.println("Original names: " + Arrays.toString(names));
        System.out.println("HashSet names: " + uniqueNames);
    }
}

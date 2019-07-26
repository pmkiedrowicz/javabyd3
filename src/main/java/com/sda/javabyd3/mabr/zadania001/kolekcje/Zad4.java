package com.sda.javabyd3.mabr.zadania001.kolekcje;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zad4 {
    public static void main(String[] args) {
        List<String> matrix = new ArrayList<>();
        matrix.add("Jan");
        matrix.add("Anna");
        matrix.add("Stefan");
        matrix.add("Iwona");
        matrix.add("Izydor");
        matrix.add("Ewa");
        matrix.add("Darek");
        matrix.add("Ela");
        matrix.add("Eryk");
        matrix.add("Nina");
        Scanner scanner = new Scanner(System.in);
        String inPut;
        System.out.println("Zawartosc matrycy przed: ");
        for (String item : matrix) {
            System.out.print(" " + item);
        }
        System.out.println("\n Podaj imiona ktore chcesz dodac do matrycy");
        while (true) {
            inPut = scanner.nextLine();
            if (inPut.equals("koniec")) break;
            if (!matrix.contains(inPut)) matrix.add(inPut);
            else System.out.println("To imie jest juz w martycy");
        }
        System.out.println("Zawartosc matrycy po: ");
        for (String item : matrix) {
            System.out.print(" " + item);
        }
    }
}

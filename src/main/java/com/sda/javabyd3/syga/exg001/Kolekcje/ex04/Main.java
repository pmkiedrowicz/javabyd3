package com.sda.javabyd3.syga.exg001.Kolekcje.ex04;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<String> names = new TreeSet<>();
        names.add("Sylwek");
        names.add("Judyta");
        names.add("Jan");
        names.add("Piotr");
        names.add("Kleks");
        names.add("Pan Tadeusz");
        names.add("Adam");
        names.add("Ewa");
        names.add("Artur");
        names.add("Zbigniew");

        System.out.println(names);

        Scanner keybord = new Scanner(System.in);
        String newName = "";
        System.out.println("\nDodaj trzy imiona:");
        for (int i = 0; i < 3; i++) {
            newName = keybord.nextLine();
            names.add(newName);
        }
        System.out.println("\n" + names);

    }
}

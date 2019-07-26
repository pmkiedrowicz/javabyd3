package com.sda.javabyd3.kawa.exg009.ex03;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int searchBy = 0;
        String searchFor;

        List<Contacts> constactsList = new ArrayList<>();
        constactsList.add(new Contacts("Jan", "Kowalski", 234123542, "jank@gmail.com"));
        constactsList.add(new Contacts("Janusz", "Kowalewski", 975123432, "januszk@gmail.com"));
        constactsList.add(new Contacts("Janina", "Janiecka", 264832366, "janinaj@gmail.com"));

        //a
        ContactWriterToFile contactWriterToFile = new ContactWriterToFile();
        ContactsReaderFromFile contactsReaderFromFile = new ContactsReaderFromFile();
        System.out.println("Zapisano kontakty do pliku.");

        //b
        contactWriterToFile.writingContactsToFile(constactsList);
        contactsReaderFromFile.readingContFromFile().stream().forEach(System.out::println);
        System.out.println("Wczytano wszystkie kontakty z pliku.");
        System.out.println(" ");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Przejdz do wyszukiwania wprowadzajac dowolny znak : ");
        String keyToProg = scanner.nextLine();

        //c
        System.out.println("Menu - wyszukaj kontakt po danych wprowadzajac odpowiednia wartosc:");
        System.out.println("1 - wyszukaj po nazwisku.");
        System.out.println("2 - wyszukaj po numerze telefonu.");
        System.out.println("3 - wyszukaj po adresie email.");


        try {
            System.out.println("Podaj wartosc z menu od (1-3): ");
            searchBy = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Podano zla wartosc!");
        }


        if (searchBy == 1) {
            System.out.println("Podaj nazwisko: ");
            searchFor = scanner.next();
            System.out.println(new SearchBySurname().searchFor(constactsList, searchFor));

        } else if (searchBy == 2) {
            System.out.println("Podaj numer telefonu: ");
            searchFor = scanner.next();
            System.out.println(new SearchByPhoneNumber().searchFor(constactsList, searchFor));

        } else if (searchBy == 3) {
            System.out.println("Podaj adres email: ");
            searchFor = scanner.next();
            System.out.println(new SearchByEmail().searchFor(constactsList, searchFor));
        } else {
            System.out.println("Podano zla wartosc!");
        }

        //d
        System.out.println("Podaj dowolna wartosc powiazana z kontaktem: ");
        Scanner ads = new Scanner(System.in);
        String anyThin = ads.nextLine();
        System.out.println(new SearchForAny().searchFor(constactsList,anyThin));

    }
}


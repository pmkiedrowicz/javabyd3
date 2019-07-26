package com.sda.javabyd3.kawa.exg010.ex03;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<BankAcc> listPerson1 = new ArrayList<BankAcc>() {{
            add(new BankAcc("KontoMM1", 4201.23));
            add(new BankAcc("KontoMM2", 2300.31));
            add(new BankAcc("KontoMM3", 11302.22));
            add(new BankAcc("KontoMM4", 1032.32));
        }};
        Person personMM = new Person("Monika", "Majka", listPerson1);

        List<BankAcc> listPerson2 = new ArrayList<BankAcc>() {{
            add(new BankAcc("KontoKK1", 42501.23));
            add(new BankAcc("KontoKK2", 123.31));
            add(new BankAcc("KontoKK3", 23.22));
        }};
        Person personKK = new Person("Kasia", "Kijek", listPerson2);

        List<BankAcc> listPerson3 = new ArrayList<BankAcc>() {{
            add(new BankAcc("KontoJJ1", 1231.23));
            add(new BankAcc("KontoJJ2", 32450.31));
            add(new BankAcc("KontoJJ3", 1235.22));
            add(new BankAcc("KontoJJ4", 554.32));
            add(new BankAcc("KontoJJ5", 11113.32));
            add(new BankAcc("KontoJJ6", 123567.32));
        }};
        Person personJJ = new Person("Justyna", "Jak", listPerson3);

        List<BankAcc> listPerson4 = new ArrayList<BankAcc>() {{
            add(new BankAcc("KontoBB1", 111324.23));
            add(new BankAcc("KontoBB2", 452.31));
        }};
        Person personBB = new Person("Basia", "Bojka", listPerson4);

        List<BankAcc> listPerson5 = new ArrayList<BankAcc>() {{
            add(new BankAcc("KontoAZ1", 3424.23));
            add(new BankAcc("KontoAZ2", 2300.31));
        }};
        Person personAZ = new Person("Aneta", "Zareba", listPerson5);

        List<Person> personsWithBankAccs = new ArrayList<Person>() {{
            add(personAZ);
            add(personBB);
            add(personJJ);
            add(personKK);
            add(personMM);
        }};

        SortByBalance sortByBalance = new SortByBalance();
        List<Person> listAfterSorting =  sortByBalance.sortingByBalance(personsWithBankAccs);
        Collections.reverse(listAfterSorting);
        listAfterSorting
                .forEach((e -> System.out.println(" " + e.name + " " + e.lastName + " - " + e.accounts.stream()
                .mapToDouble(p -> p.balance).sum())));
    }
}

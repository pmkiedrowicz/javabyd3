package com.sda.javabyd3.kade.exg010.ex03;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<BankAccount> listOfPersons = new ArrayList<BankAccount>();

        Person person1 = new Person("Kamil", "Derra");
        listOfPersons.add(new BankAccount("Konto1A", 4650.68));
        listOfPersons.add(new BankAccount("Konto1B", 14220.00));

        Person person2 = new Person("Anna", "Karenina");
        listOfPersons.add(new BankAccount("Konto2A", 23348.00));
        listOfPersons.add(new BankAccount("Konto2B", 4330.05));

        Person person3 = new Person("Dominik", "Miłek");
        listOfPersons.add(new BankAccount("Konto3A", 1225.09));
        listOfPersons.add(new BankAccount("Konto3B", 2334.43));

        Person person4 = new Person("Marian", "Krzak");
        listOfPersons.add(new BankAccount("Konto4A", 33589.90));
        listOfPersons.add(new BankAccount("Konto4B", 2188.08));

        Person person5 = new Person("Kala", "Jerzy");
        listOfPersons.add(new BankAccount("Konto5A", 2123.45));
        listOfPersons.add(new BankAccount("Konto5B", 32443.99));


        List<Person> personsWithBankAccount = new ArrayList<Person>();

        personsWithBankAccount.add(person1);
        personsWithBankAccount.add(person2);
        personsWithBankAccount.add(person3);
        personsWithBankAccount.add(person4);
        personsWithBankAccount.add(person5);

    }


}

package com.sda.javabyd3.daol.exg010.ex03;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<BankAccount> accounts = new ArrayList<>();
        accounts.add(new BankAccount("PLN", 1500d));
        accounts.add(new BankAccount("GBP", 5456d));
        Person person = new Person("Jan", "Kowalski", accounts);

        List<BankAccount> accounts1 = new ArrayList<>();
        accounts.add(new BankAccount("PLN", 1750d));
        accounts.add(new BankAccount("GBP", 2659d));
        Person person1 = new Person("Natalia", "Mózg", accounts1);

        List<BankAccount> accounts2 = new ArrayList<>();
        accounts2.add(new BankAccount("PLN", 5236d));
        accounts2.add(new BankAccount("GBP", 75412d));
        Person person2 = new Person("Franek", "Kimono", accounts2);

        List<BankAccount> accounts3 = new ArrayList<>();
        accounts3.add(new BankAccount("PLN", 125d));
        accounts3.add(new BankAccount("GBP", 9853265d));
        Person person3 = new Person("Grzegorz", "Janek", accounts3);

        List<BankAccount> accounts4 = new ArrayList<>();
        accounts4.add(new BankAccount("PLN", 56894d));
        accounts4.add(new BankAccount("GBP", 7456d));
        Person person4 = new Person("Paweł", "Kowalski", accounts4);


        List<Person> client = new ArrayList<>();
        client.add(person);
        client.add(person1);
        client.add(person2);
        client.add(person3);
        client.add(person4);

        List<Person> sortedClient =  client.stream().sorted((n1 , n2)->
                Double.compare(
                        n1.getAccounts().stream().mapToDouble(n-> n.balance).sum(),
                        n2.getAccounts().stream().mapToDouble(n-> n.balance).sum())).collect(Collectors.toList());


        sortedClient.stream().forEach(n-> System.out.println(n.getName()
                + " "+ n.getLastName()
                + " "));
    }
}

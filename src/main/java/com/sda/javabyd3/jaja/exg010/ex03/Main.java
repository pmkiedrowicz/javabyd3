package com.sda.javabyd3.jaja.exg010.ex03;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<BankAccount> accounts1 = new ArrayList<>();
        accounts1.add(new BankAccount("PLN", 1500d));
        accounts1.add(new BankAccount("EUR", 1800d));
        Person person1 = new Person("Jan", "Kowlaski",accounts1);

        List<BankAccount> accounts2 = new ArrayList<>();
        accounts2.add(new BankAccount("PLN", 1900d));
        accounts2.add(new BankAccount("EUR", 1820d));
        Person person2 = new Person("Jakub", "Kowlaski",accounts2);

        List<BankAccount> accounts3 = new ArrayList<>();
        accounts3.add(new BankAccount("PLN", 4500d));
        accounts3.add(new BankAccount("EUR", 6800d));
        Person person3 = new Person("Marek", "Kowlaski",accounts3);

        List<BankAccount> accounts4 = new ArrayList<>();
        accounts4.add(new BankAccount("PLN", 8500d));
        accounts4.add(new BankAccount("EUR", 7800d));
        Person person4 = new Person("Jagoda", "Jarz",accounts4);

        List<BankAccount> accounts5 = new ArrayList<>();
        accounts5.add(new BankAccount("PLN", 2500d));
        accounts5.add(new BankAccount("EUR", 1600d));
        Person person5 = new Person("Paulina", "Wawa",accounts5);

        List<Person> client = new ArrayList<>();
        client.add(person1);
        client.add(person2);
        client.add(person3);
        client.add(person4);
        client.add(person5);

//        Optional<Person> sort = client.stream().sorted((n1,n2) -> n1.getAccounts().sort())

       List<Person> sortedClient =  client.stream().sorted((n1 , n2)->
                Double.compare(
                        n1.getAccounts().stream().mapToDouble(n-> n.balance).sum(),
                        n2.getAccounts().stream().mapToDouble(n-> n.balance).sum())).collect(Collectors.toList());

        System.out.println("Posortowane osoby wg sumy zarobków: ");
        sortedClient.stream().forEach(n-> System.out.println(
                    n.getName()
                    + " "+ n.getLastName()
                    + " " ));

//        sortedClient.stream().forEach(n-> System.out.println(n.getName()
//                + " "+ n.getLastName()
//                + " " );
    }
}

package com.sda.javabyd3.urdu.exg010.ex03;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Person> persons = new ArrayList<>();
        Methods methods = new Methods();

        List<BankAccount> accounts1 = new ArrayList<>();
        accounts1.add(new BankAccount("konto1", 6000d));
        accounts1.add(new BankAccount("konto1.2", 2100d));

        List<BankAccount> accounts2 = new ArrayList<>();
        accounts2.add(new BankAccount("konto2", 4000d));
        accounts2.add(new BankAccount("konto2.2", 5600d));

        List<BankAccount> accounts3 = new ArrayList<>();
        accounts3.add(new BankAccount("konto3", 1300d));
        accounts3.add(new BankAccount("konto3.2", 4000d));

        List<BankAccount> accounts4 = new ArrayList<>();
        accounts4.add(new BankAccount("konto4", 2000d));
        accounts4.add(new BankAccount("konto4.2", 3000d));
        accounts4.add(new BankAccount("konto4.3", 9500d));

        List<BankAccount> accounts5 = new ArrayList<>();
        accounts5.add(new BankAccount("konto4", 400d));
        accounts5.add(new BankAccount("konto5.2", 7500d));

        Person person1 = new Person("Urszula", "D", accounts1);
        Person person2 = new Person("Paweł", "S", accounts2);
        Person person3 = new Person("Marta", "A", accounts3);
        Person person4 = new Person("Adam", "N", accounts4);
        Person person5 = new Person("Krzysztof", "G", accounts5);

        persons.add(person1);
        persons.add(person2);
        persons.add(person3);
        persons.add(person4);
        persons.add(person5);

        System.out.println(persons.toString());


        System.out.println("środki na 1 koncie: " + methods.sumBalanceAccount(accounts1));
        System.out.println("środki na 2 koncie: " + methods.sumBalanceAccount(accounts2));
        System.out.println("środki na 3 koncie: " + methods.sumBalanceAccount(accounts3));
        System.out.println("środki na 4 koncie: " + methods.sumBalanceAccount(accounts4));
        System.out.println("środki na 5 koncie: " + methods.sumBalanceAccount(accounts5));


     /*  System.out.println("Posortowani wg środków na koncie: ");
        persons.stream().sorted((k1,k2) -> Double.compare(
                k1.getAccounts().stream().mapToDouble(n-> n.getBalance()).sum() ,
                k2.getAccounts().stream().mapToDouble(n-> n.getBalance()).sum())).forEach(person ->
                System.out.println(person.toString() +
                  "Suma środków na kontach to: " + methods.sumBalanceAccount(person.getAccounts())));
            */
        System.out.println("Osoby posortowane wg środków na kontach: ");
        methods.sortOfAccountsBalance(persons);

    }
}

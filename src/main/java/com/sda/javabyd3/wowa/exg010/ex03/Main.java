//3. Utwórz klasę sortującą osoby na podstawie środków zgromadzonych na kontach.
//Metodę sortującą umieść w osobnej klasie, tak aby można było łatwo wykonać testy
//jednostkowe. Wykonaj zadanie zgodnie z poniższymi punktami.
//a. Utwórz klasę BankAccount zawierającą pola:
//i. name typu String
//ii. balance typu Double
//b. Utwórz klasę Person zawierającą pola:
//i. name typu String
//ii. lastName typu String
//iii. accounts typu List<BankAccount>
//c. Utwórz 5 osób posiadających co najmniej 2 konta na liście accounts.
//d. Dodaj utworzone osoby do listy List<paerson>
//e. Za pomocą strumieni posortuj osoby według sumy środków zgromadzonych
//na posiadanych kontach
//persons.stream().sorted(<wyrażenie lambda>);
//f. Wyświetl posortowane osoby.
//g. Przygotuj testy jednostkowe sprawdzające metodę sortowania.

package com.sda.javabyd3.wowa.exg010.ex03;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<BankAccount> accountList1 = new ArrayList<>();
        accountList1.add(new BankAccount("konto1", 27000d));
        accountList1.add(new BankAccount("konto2", 37000d));

        List<BankAccount> accountList2 = new ArrayList<>();
        accountList2.add(new BankAccount("konto3", 47000d));
        accountList2.add(new BankAccount("konto4", 15000d));

        List<BankAccount> accountList3 = new ArrayList<>();
        accountList3.add(new BankAccount("konto5", 17000d));
        accountList3.add(new BankAccount("konto6", 37000d));

        List<BankAccount> accountList4 = new ArrayList<>();
        accountList4.add(new BankAccount("konto7", 2000d));
        accountList4.add(new BankAccount("konto8", 7000d));

        List<BankAccount> accountList5 = new ArrayList<>();
        accountList5.add(new BankAccount("konto9", 400d));
        accountList5.add(new BankAccount("konto10", 7500d));

        //Person person1 = new Person("Wojtek", "Wasilewski", Arrays.asList( new BankAccount("konto1", 34000d));
        Person person1 = new Person("Wojtek", "W", accountList1);
        Person person2 = new Person("Marek", "M", accountList2);
        Person person3 = new Person("Tomek", "T", accountList3);
        Person person4 = new Person("Ania", "A", accountList4);
        Person person5 = new Person("Maria", "M", accountList5);

        List<Person> listOfPersons = new ArrayList<Person>() {{
            add(person1);
            add(person2);
            add(person3);
            add(person4);
            add(person5);
        }};

        System.out.println("Srodki roznych osob na kontach, rosnaco: ");
        listOfPersons.stream()
                .sorted((p1, p2) -> Double.compare(p1.accounts.stream().mapToDouble(p ->
                        p.balance).sum(), p2.accounts.stream().mapToDouble(p -> p.balance).sum()))
                .forEach(p -> System.out.println(p.name + " " + p.lastname));
    }
}

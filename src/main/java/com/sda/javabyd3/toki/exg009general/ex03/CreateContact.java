package com.sda.javabyd3.toki.exg009general.ex03;

import java.util.Scanner;

public class CreateContact {

    public CreateContact() {
    }

    public Person CreateContact() {

        Person person = new Person();
        Scanner scanner = new Scanner(System.in);

            System.out.print("Name: ");
            person.setName(scanner.nextLine());

            System.out.print("Surname: ");
            person.setSurname(scanner.nextLine());

            System.out.print("Tel: ");
            person.setTel(scanner.nextLine());

            System.out.print("E-mail: ");
            person.setEmail(scanner.nextLine());

        return person;
    }
}

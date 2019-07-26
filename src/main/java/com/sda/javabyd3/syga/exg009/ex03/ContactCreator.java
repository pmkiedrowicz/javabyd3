package com.sda.javabyd3.syga.exg009.ex03;

import java.util.Scanner;

public class ContactCreator {

    public ContactCreator(){
    }

    public Person contactCodeCreator(){
        Person person = new Person();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name: ");
        person.setName(scanner.nextLine());
        System.out.println("Surname: ");
        person.setSurname(scanner.nextLine());
        System.out.println("Phone number: ");
        person.setPhoneNumber(scanner.nextLine());
        System.out.println("E-mail: ");
        person.setEmailAddres(scanner.nextLine());
        return person;
    }
}

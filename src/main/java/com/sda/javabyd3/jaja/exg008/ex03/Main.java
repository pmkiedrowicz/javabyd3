package com.sda.javabyd3.jaja.exg008.ex03;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        NameValidator nameValidator = new NameValidator();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj imię: ");
        String name = scanner.nextLine();
        Boolean validName = nameValidator.validate(name);
        System.out.println(String.format("Podane imie %s%s jest poprawne." , name, validName ? "" : " nie"));
    }
}

package com.sda.javabyd3.daol.exg008.ex03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj imię: ");
        String name = scanner.nextLine();

        NameValidator nameValidator = new NameValidator();
        Boolean nameIsValid = nameValidator.validate(name);
        String txt;
        if (nameIsValid) {
            txt = " ";
        } else {
            txt = " nie";
        }
        System.out.println(String.format("Podane imię%s jest poprawne.", txt));
    }
}

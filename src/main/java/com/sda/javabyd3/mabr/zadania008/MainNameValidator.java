package com.sda.javabyd3.mabr.zadania008;

import java.util.Scanner;

public class MainNameValidator {
    public static void main(String[] args) {
        String name;
        Scanner read = new Scanner(System.in);
        name = read.nextLine();
        NameValidator nameValidator = new NameValidator();

        if (nameValidator.validate(name)) {
            System.out.println(name + " is correct name");
        } else {
            System.out.println(name + " is not a correct name");
        }
    }
}

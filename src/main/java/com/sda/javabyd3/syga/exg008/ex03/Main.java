package com.sda.javabyd3.syga.exg008.ex03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Provide a name: ");
        String name = scanner.nextLine();
        NameValidator nameValidator = new NameValidator();
        System.out.println(nameValidator.nameValidator(name));
        scanner.close();
    }
}

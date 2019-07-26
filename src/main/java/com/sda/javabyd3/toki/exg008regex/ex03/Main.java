package com.sda.javabyd3.toki.exg008regex.ex03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Type a name" );
        String name = scanner.nextLine();
        NameValidator nameValidator = new NameValidator();

        System.out.println(nameValidator.validate(name));
        scanner.close();
    }
}
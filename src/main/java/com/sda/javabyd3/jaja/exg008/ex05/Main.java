package com.sda.javabyd3.jaja.exg008.ex05;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        WebAdressValidator webAdressValidator = new WebAdressValidator();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adres www: ");
        String webAdress = scanner.nextLine();
        boolean validAdress = webAdressValidator.validate(webAdress);
        System.out.println(String.format("Podany adres %s%s jest poprawny.", webAdress, validAdress ? "" : " nie"));
    }
}

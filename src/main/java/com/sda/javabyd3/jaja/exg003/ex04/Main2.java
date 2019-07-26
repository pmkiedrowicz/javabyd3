package com.sda.javabyd3.jaja.exg003.ex04;

import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {

        DeletePolishChar2 deletePolishChar2 = new DeletePolishChar2();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj tekst zawierający polskie znaki: ");
        String text = scanner.nextLine();
        System.out.println("Tekst bez polskich znaków: " + deletePolishChar2.deletePolishChar2(text));
}
}
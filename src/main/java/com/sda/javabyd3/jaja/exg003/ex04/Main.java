package com.sda.javabyd3.jaja.exg003.ex04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        DeletePolishChar deletePolishChar = new DeletePolishChar();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj słowo zawierające diakrytyczne: ");
        String word = scanner.nextLine();
        System.out.println(deletePolishChar.deleteChar(word));

    }
}

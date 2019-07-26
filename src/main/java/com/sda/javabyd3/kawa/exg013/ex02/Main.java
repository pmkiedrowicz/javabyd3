package com.sda.javabyd3.kawa.exg013.ex02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        CheckIfTextLengthInstNull checkIfTextLengthInstNull = new CheckIfTextLengthInstNull();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wyraz: ");
        String word = scanner.nextLine();

        System.out.println("Dlugosc wyrazu wynosi - " + checkIfTextLengthInstNull.checkingIfTextLengthIsntNull(word)
                + " liter");

    }
}

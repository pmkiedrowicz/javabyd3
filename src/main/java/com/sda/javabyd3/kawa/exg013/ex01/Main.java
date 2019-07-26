package com.sda.javabyd3.kawa.exg013.ex01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        IsntNullChecker isntNullChecker = new IsntNullChecker();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wspisz cokolwiek w konsole: ");
        String anyThin = scanner.nextLine();

        System.out.println("Checking if obiect is not null -> ");
        System.out.println(isntNullChecker.checkingIfObiectIsntNull(anyThin));

    }
}

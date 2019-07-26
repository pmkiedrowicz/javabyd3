package com.sda.javabyd3.toki.exg009general.ex05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String input = "";
        Scanner scanner = new Scanner(System.in);

        System.out.print("Put an equation here... ");
        input = scanner.next();

        EquationChecker equationChecker = new EquationChecker();
        System.out.println(equationChecker.checkForEquation(input));

    }
}

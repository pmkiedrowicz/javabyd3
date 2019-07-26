package com.sda.javabyd3.jaja.exg009.ex05.pisemnie;

import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wybierz działąnie wpisująć odpowidni znak: " +
                "\n dodawanie -[+] " +
                "\n odejmowanie - [-] " +
                "\n mnożenie - [*] " +
                "\n dzielenie - [/] " +
                "\n pierwiastek - [^]");
        String answer = scanner.nextLine();
        if (answer.equals("+")) {
            System.out.println("Dodawanie:");
            String c = scanner.nextLine();
            String d = scanner.nextLine();
            Double one = Double.parseDouble(c);
            Double two = Double.parseDouble(d);
            System.out.println(calculator.sum(one, two));
        } else if (answer.equals("-")) {
            System.out.println("Odejmowanie:");
            String c = scanner.nextLine();
            String d = scanner.nextLine();
            Double one = Double.parseDouble(c);
            Double two = Double.parseDouble(d);
            System.out.println(calculator.subtract(one, two));
        } else if (answer.equals("*")) {
            System.out.println("Mnożenie:");
            String c = scanner.nextLine();
            String d = scanner.nextLine();
            Double one = Double.parseDouble(c);
            Double two = Double.parseDouble(d);
            System.out.println(calculator.multiply(one, two));
        } else if (answer.equals("/")) {
            System.out.println("Dzielenie:");
            String c = scanner.nextLine();
            String d = scanner.nextLine();
            Double one = Double.parseDouble(c);
            Double two = Double.parseDouble(d);
            System.out.println(calculator.divide(one, two));
        } else if (answer.equals("^")) {
            System.out.println("Pierwiastek:");
            String c = scanner.nextLine();
            String d = scanner.nextLine();
            Double one = Double.parseDouble(c);
            Double two = Double.parseDouble(d);
            System.out.println(calculator.exponentiation(one, two));
        } else System.out.println("Błędny wybór");
    }
}
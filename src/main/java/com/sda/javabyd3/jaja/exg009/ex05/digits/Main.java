package com.sda.javabyd3.jaja.exg009.ex05.digits;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        CalculatorDigits calculator = new CalculatorDigits();
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
            String abc = scanner.nextLine();
            double a = Character.digit(abc.charAt(0), 10);
            double c = Character.digit(abc.charAt(2), 10);
            System.out.println(calculator.sum(a, c));
        } else if (answer.equals("-")){
            System.out.println("Odejmowanie:");
            String abc = scanner.nextLine();
            double a = Character.digit(abc.charAt(0), 10);
            double c = Character.digit(abc.charAt(2), 10);
            System.out.println(calculator.subtract(a, c));
        }else if (answer.equals("*")){
            System.out.println("Mnożenie:");
            String abc = scanner.nextLine();
            double a = Character.digit(abc.charAt(0), 10);
            double c = Character.digit(abc.charAt(2), 10);
            System.out.println(calculator.multiply(a, c));
        }else if (answer.equals("/")){
            System.out.println("Dzielenie:");
            String abc = scanner.nextLine();
            double a = Character.digit(abc.charAt(0), 10);
            double c = Character.digit(abc.charAt(2), 10);
            System.out.println(calculator.divide(a, c));
        }else if (answer.equals("^")){
            System.out.println("Pierwiastek:");
            String abc = scanner.nextLine();
            double a = Character.digit(abc.charAt(0), 10);
            double c = Character.digit(abc.charAt(2), 10);
            System.out.println(calculator.exponentiation(a, c));
        }
        else System.out.println("Niepoprawna odpowiedź.");
    }
}


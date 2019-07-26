package com.sda.javabyd3.jaja.exg009.ex05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ConverterMarks converterMarks = new ConverterMarks();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Calculator: ");
        String numbers = scanner.nextLine();
        System.out.println("Result = " + converterMarks.convertStringToMark(numbers));

    }
}

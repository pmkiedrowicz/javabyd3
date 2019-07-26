package com.sda.javabyd3.jaja.exg009.ex05.onlySum;

import java.util.Scanner;

public class MainCWM {

    public static void main(String[] args) {

        CalculatorWithMarks calc = new CalculatorWithMarks();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dodawanie: ");
        String numberWithMark = scanner.nextLine();
        System.out.println(calc.sum(numberWithMark));

}
}

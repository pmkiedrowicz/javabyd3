package com.sda.javabyd3.toki.exg009general.ex04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String numberOfTicketsTemp;
        String inputCashTemp;
        int numberOfTickets = 0;
        int inputCash = 0;
        Scanner scanner = new Scanner(System.in);
        ExchangeMachine exchangeMachine = new ExchangeMachine();


        System.out.println("How much tickets do U want? ");
        numberOfTicketsTemp = scanner.next();

        System.out.println("Put the cash: ");
        inputCashTemp = scanner.next();

        try {
            numberOfTickets = Integer.parseInt(numberOfTicketsTemp);
            inputCash = Integer.parseInt(inputCashTemp);
        } catch (NumberFormatException e) {
            System.out.println("Something wrong with input. Program won't continue.");
            return;
        }

            exchangeMachine.exchangeMachine(numberOfTickets, inputCash);
            scanner.close();
    }
}
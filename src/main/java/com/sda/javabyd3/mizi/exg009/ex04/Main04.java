package com.sda.javabyd3.mizi.exg009.ex04;

import java.util.Scanner;

/**
 * Created by Michal Ziolecki.
 */
public class Main04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        CashMachine cashMachine = new CashMachine();
        Integer numberOfTicket = 0;
        Integer money = 0;
        System.out.println("Write here how many ticket do you want: ");
        numberOfTicket = scanner.nextInt();
        System.out.println("You need to pay: "+ numberOfTicket*4 + " PLN");
        System.out.println("Write here how many you want to pay: ");

        money = scanner.nextInt();
        cashMachine.returnTheRestOfCash( numberOfTicket, money );
    }
}

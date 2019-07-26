package com.sda.javabyd3.urdu.exg009.ex04;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        TicketMachine tM = new TicketMachine();
        System.out.println("Podaj liczbę biletów");
        int numberOfBilets = scan.nextInt();

        System.out.println("Dokonaj płatności: (wpisz kwotę jaką wpłacasz:)");
        int money = scan.nextInt();

        System.out.println(tM.ticketMachine(numberOfBilets,money));

    }
}

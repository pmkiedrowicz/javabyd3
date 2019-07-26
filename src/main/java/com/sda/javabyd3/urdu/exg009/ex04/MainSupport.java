package com.sda.javabyd3.urdu.exg009.ex04;

public class MainSupport {
    public static void main(String[] args) {
        int number= 300/200;
        System.out.println(number);

        TicketMachine ticketMachine = new TicketMachine();

        System.out.println(ticketMachine.returnChange(537));

    }
}

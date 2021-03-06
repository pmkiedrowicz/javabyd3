package com.sda.javabyd3.urdu.designPattern.adapter;

import java.time.LocalDateTime;
import java.util.Date;

public class Main {

    public static void main(String[] args) {

        ReserveTable emailAdapter = new EmailAdapter();
        emailAdapter.reserveTable("Jan Kowalski"
            ,LocalDateTime.of(2018, 04,14,17,00)
        ,12);

        System.out.println("Rezerwacja sms");

        ReserveTable smsAdapter = new SmsAdapter();
        smsAdapter.reserveTable("Jan Kowalski"
                ,LocalDateTime.of(2018, 04,14,17,00)
                ,12);
    }

}

package com.sda.javabyd3.kade.DesignPattern.Adapter;

import java.time.LocalDateTime;
import java.util.Date;

public class Main {

    public static void main(String[] args) {

        ReserveTable reserveTable = new EmailAdapter();
        reserveTable.reserveTable("Jan Kowalski"
                     , LocalDateTime.of(2018, 04, 14, 18, 15)
                     , 12);

        ReserveTable smsAdapter = new SmsAdapter();
        smsAdapter.reserveTable("Jan Kowalski"
        , LocalDateTime.of(2018, 04, 14, 18, 15)
        , 12);

    }
}

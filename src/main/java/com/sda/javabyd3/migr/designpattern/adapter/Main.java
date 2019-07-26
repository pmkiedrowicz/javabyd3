package com.sda.javabyd3.migr.designpattern.adapter;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        ReserveTable emailAdapter = new EmailAdapter();
        emailAdapter.reserveTable("jan", LocalDateTime.of(2018, 03, 12, 12, 34), 12);

        ReserveTable smsAdapter = new SmsAdapter();
        smsAdapter.reserveTable("Andrzej", LocalDateTime.of(2117, 12, 12, 12, 01), 12);
    }
}

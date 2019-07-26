package com.sda.javabyd3.mizi.designPattern.adapter;

import java.time.LocalDateTime;

public class EmailAdapter extends BaseAdapter implements ReserveTable {

    Email email = new Email();

    @Override
    public boolean reserveTable(String person, LocalDateTime date, int numberOfPersons) {
        email.connect();
        email.authorize("login", "password");
        email.sendMessage(String.format(msg, date, numberOfPersons, person));
        email.disconnect();
        return false;
    }
}

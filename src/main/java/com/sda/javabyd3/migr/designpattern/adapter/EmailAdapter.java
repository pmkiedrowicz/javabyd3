package com.sda.javabyd3.migr.designpattern.adapter;

import java.time.LocalDateTime;
import java.util.Date;

public class EmailAdapter extends BaseAdapter implements ReserveTable {

    Email email = new Email();

    @Override
    public boolean reserveTable(String person, LocalDateTime date, int numberOfPersons) {
        email.conncet();
        email.authorize("login", "haslo");
        email.sendMessage(String.format(msg, date, numberOfPersons, person));
        email.disconnect();
        return false;
    }
}

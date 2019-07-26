package com.sda.javabyd3.kade.DesignPattern.Adapter;

import java.time.LocalDateTime;
import java.util.Date;

public class EmailAdapter extends BaseAdapter implements ReserveTable {

    Email email = new Email();

    @Override
    public boolean reserveTable(String person, LocalDateTime dateTime, int numberOfPersons) {
        email.connect();

        email.authorize("login", "password");

        email.sendMessage(String.format(msg, dateTime, numberOfPersons, person));


        email.disconnect();
        return false;
    }
}

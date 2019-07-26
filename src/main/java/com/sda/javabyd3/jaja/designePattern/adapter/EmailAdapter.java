package com.sda.javabyd3.jaja.designePattern.adapter;

import com.sda.javabyd3.urdu.designPattern.adapter.BaseAdapter;
import com.sda.javabyd3.urdu.designPattern.adapter.Email;
import com.sda.javabyd3.urdu.designPattern.adapter.ReserveTable;

import java.time.LocalDateTime;


public class EmailAdapter extends BaseAdapter implements ReserveTable {

    com.sda.javabyd3.urdu.designPattern.adapter.Email email = new Email();

    @Override
    public boolean reserveTable(String person, LocalDateTime date, int numberOfPersons) {
        email.connect();
        email.authorize("login","password");

        email.sendMessage(String.format(msg,date,numberOfPersons,person));

        email.disconnect();
        return false;
    }
}

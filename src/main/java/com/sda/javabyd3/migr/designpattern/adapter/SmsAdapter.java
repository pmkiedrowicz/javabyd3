package com.sda.javabyd3.migr.designpattern.adapter;

import java.time.LocalDateTime;
import java.util.Date;

public class SmsAdapter extends BaseAdapter implements ReserveTable {
    Sms sms = new Sms();
    String telephone;
    String smsGateway;
    @Override

    public boolean reserveTable(String person, LocalDateTime date, int numberOfPersons) {
        if (sms.chcekLine()) {
            sms.sendSms(String.format(msg, date, numberOfPersons, person), telephone,smsGateway);
            return true;
        }
        return false;
    }
}

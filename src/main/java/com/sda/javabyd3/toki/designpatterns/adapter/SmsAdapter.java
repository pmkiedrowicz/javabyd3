package com.sda.javabyd3.toki.designpatterns.adapter;

import com.sda.javabyd3.mizi.designPattern.adapter.BaseAdapter;
import com.sda.javabyd3.mizi.designPattern.adapter.ReserveTable;
import com.sda.javabyd3.mizi.designPattern.adapter.Sms;

import java.time.LocalDateTime;

public class SmsAdapter extends BaseAdapter implements ReserveTable {
    Sms sms = new Sms();
    String telephone;
    String smsGateway;
    @Override
    public boolean reserveTable(String person, LocalDateTime date, int numberOfPersons) {
        if(sms.checkLine()){
            sms.sendSms(String.format(msg, date, numberOfPersons, person), telephone, smsGateway);
            return true;
        }
        return false;
    }
}

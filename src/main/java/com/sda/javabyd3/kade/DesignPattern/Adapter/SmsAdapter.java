package com.sda.javabyd3.kade.DesignPattern.Adapter;

import java.time.LocalDateTime;
import java.util.Date;

public class SmsAdapter extends BaseAdapter implements ReserveTable {

    Sms sms = new Sms();
    String telephone;
    String smsGateway;

    @Override
    public boolean reserveTable(String person, LocalDateTime dateTime, int numberOfPersons) {

        if(sms.checkLine()){
            sms.sendSms(String.format(msg, dateTime, numberOfPersons, person), telephone, smsGateway);



            return true;

        }


        return false;
    }
}

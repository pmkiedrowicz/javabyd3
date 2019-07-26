package com.sda.javabyd3.migr.designpattern.adapter;

public class Sms {
    public boolean chcekLine() {
        System.out.println("checking line...");
        return true;
    }

    public boolean sendSms(String textMessage, String number, String smsGateWay) {
        System.out.println("senfing sms message");
        return true;
    }

}

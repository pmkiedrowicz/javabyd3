package com.sda.javabyd3.daol.projectPatterns.adapter;

public class Sms {
    public boolean checkLine() {
        System.out.println("Checking line...");
        return true;
    }

    public boolean sendSms(String textMessage, String number, String smsGateway) {
        System.out.println("Sending SMS message");
        return true;
    }
}

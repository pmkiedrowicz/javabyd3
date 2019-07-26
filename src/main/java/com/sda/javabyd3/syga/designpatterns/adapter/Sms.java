package com.sda.javabyd3.syga.designpatterns.adapter;

public class Sms {
    public boolean checkLine(){
        System.out.println("Checking line...");
        return true;
    }

    public boolean sendSms(String sendMessage, String number, String smsGateway){
        System.out.println("Sending SMS message: " + sendMessage);
        return true;
    }
}

package com.sda.javabyd3.jaja.designePattern.adapter;

public class Sms {

    public boolean checkLine(){
        System.out.println("Checking line...");
        return true;
    }

    public boolean sendSms(String textMessage, String number, String smsGateWay){
        System.out.println("Sending sms...");
        return  true;
    }
}

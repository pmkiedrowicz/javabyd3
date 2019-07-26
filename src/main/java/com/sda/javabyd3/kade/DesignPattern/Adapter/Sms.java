package com.sda.javabyd3.kade.DesignPattern.Adapter;

public class Sms {

    public boolean checkLine(){
        System.out.println("checking line...");
        return true;
    }

    public boolean sendSms(String textMessage, String number, String smsGateWay){
        System.out.println("Sending SMS message");
        return true;
    }


}

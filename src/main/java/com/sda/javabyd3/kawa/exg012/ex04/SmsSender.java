package com.sda.javabyd3.kawa.exg012.ex04;

public class SmsSender implements GenericMessageSender {
    @Override
    public void sendMessage(Object object) {
        System.out.println(object.toString());
    }
}

package com.sda.javabyd3.kawa.exg012.ex04;

public class Message <T> {

    private T myMessage;

    public void messageType (T object){
        this.myMessage = object;
    }

    @Override
    public String toString() {
        return "Message{"+ myMessage +
                '}';
    }
}

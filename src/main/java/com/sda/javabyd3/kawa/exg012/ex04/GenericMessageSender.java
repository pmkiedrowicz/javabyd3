package com.sda.javabyd3.kawa.exg012.ex04;

public interface GenericMessageSender <T> {
    void sendMessage (T object);
}

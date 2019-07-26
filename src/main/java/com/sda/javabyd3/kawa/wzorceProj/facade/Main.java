package com.sda.javabyd3.kawa.wzorceProj.facade;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Main {
    public static void main(String[] args) throws UnknownHostException {
        Message message = Message.builder()
                .text("Tekst wiadomosci")
                .receipient("Receipient")
                .status("Status")
                .build();

        Connection connection = new ConnectionImp1();
        Messaging messaging = new Messaging(connection, InetAddress.getByName("192.168.1.1"), 5555);
        messaging.sendMessage(message);
    }
}

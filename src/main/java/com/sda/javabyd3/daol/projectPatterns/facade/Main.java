package com.sda.javabyd3.daol.projectPatterns.facade;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Main {

    public static void main(String[] args) throws UnknownHostException {
        Message message = Message.builder()
                .text("tekst wiadomości")
                .receipient("sss")
                .status("sss")
                .build();
        Connection connection = new ConnectionImpl();
        Messaging messaging = new Messaging(5555, connection, InetAddress.getByName("192.168.1.1"));
        messaging.sendMessage(message);
    }
}

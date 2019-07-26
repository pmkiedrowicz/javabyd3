package com.sda.javabyd3.syga.designpatterns.facade;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Main {
    public static void main(String[] args) throws UnknownHostException{
        Message message = Message.builder()
                .text("Tekst wiadomości")
                .receipient("sss")
                .status("good")
                .build();
        Connection connection = new ConnectionImpl();
        Messaging messaging = new Messaging(connection, InetAddress.getByName("192.168.1.1"), 5555);
        messaging.sendMessage(message);
    }
}

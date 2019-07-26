package com.sda.javabyd3.kade.DesignPattern.Facade;

import lombok.Builder;

import java.net.InetAddress;
import java.net.UnknownHostException;



public class Main {

    public static void main(String[] args) throws UnknownHostException {
        Message message = Message.builder().text("Tekst wiadomości")
                         .receipient("ass")
                         .status("sss")
                         .build();

        Connection connection = new ConnectionImpl();
                Messaging messaging = new Messaging(connection, InetAddress.getByName("192.168.1.1"), 5555);
                messaging.sendMessage(message);
        }

    }



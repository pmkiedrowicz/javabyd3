package com.sda.javabyd3.migr.designpattern.facade;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Main {
    public static void main(String[] args) throws UnknownHostException {
        Message message = Message.builder()
                .receipient("sss")
                .status("status")
                .text("tekst jakis ")
                .build();
        Conection conection = new ConectionImpl();
        Messeging messeging = new Messeging(conection, InetAddress.getByName("192.168.1.1"), 5555);
        messeging.sendMessage(message);
        System.out.println(message);


    }
}

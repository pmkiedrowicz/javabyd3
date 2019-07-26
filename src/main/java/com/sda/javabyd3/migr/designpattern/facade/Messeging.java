package com.sda.javabyd3.migr.designpattern.facade;

import lombok.AllArgsConstructor;
import org.apache.commons.lang3.ArrayUtils;

import java.net.InetAddress;

@AllArgsConstructor
public class Messeging {

    private Conection conection;
    private InetAddress address;
    int port;

    public void sendMessage(Message message) {
        conection.open(address, port);
        byte[] receipient = message.getReceipient().getBytes();
        byte[] msg = message.getText().getBytes();
        byte[] status = message.getStatus().getBytes();

        byte[] data = ArrayUtils.addAll(receipient, msg);
        data = ArrayUtils.addAll(data, status);

        conection.send(data, data.length);


        conection.close();

    }
}

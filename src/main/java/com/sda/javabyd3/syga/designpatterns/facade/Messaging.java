package com.sda.javabyd3.syga.designpatterns.facade;

import lombok.AllArgsConstructor;
import org.apache.commons.lang3.ArrayUtils;

import java.net.InetAddress;

@AllArgsConstructor
public class Messaging {
    private Connection connection;
    private InetAddress address;
    int port;

    public void sendMessage(Message message){
        connection.open(address, port);
        byte[] receipient = message.getReceipient().getBytes();
        byte[] msg = message.getText().getBytes();
        byte[] status = message.getStatus().getBytes();

        byte[] data = ArrayUtils.addAll(receipient,msg); //dodawanie tablic (ArrayUtlis ma możliwość dodania tylko dwóch tablic)
        data = ArrayUtils.addAll(data, status);             // dlatego tutaj dodajemy trzecią

        connection.send(data, data.length);
        connection.close();
    }
}

package com.sda.javabyd3.daol.projectPatterns.facade;

import lombok.AllArgsConstructor;
import org.apache.commons.lang3.ArrayUtils;

import java.net.InetAddress;

@AllArgsConstructor
public class Messaging {
    int port;
    private Connection connection;
    private InetAddress address;

    public void sendMessage(Message message) {
        connection.open(address, port);
        byte[] receipient = message.getReceipient().getBytes();
        byte[] msg = message.getText().getBytes();
        byte[] status = message.getStatus().getBytes();

        byte[] data = ArrayUtils.addAll(receipient, msg);
        data = ArrayUtils.addAll(data, status);

        connection.send(data, data.length);

        connection.close();

    }
}

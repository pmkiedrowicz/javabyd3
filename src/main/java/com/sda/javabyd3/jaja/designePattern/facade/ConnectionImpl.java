package com.sda.javabyd3.jaja.designePattern.facade;

import com.sda.javabyd3.urdu.designPattern.facade.Connection;

import java.net.InetAddress;

public class ConnectionImpl implements Connection {
    @Override
    public boolean open(InetAddress adress, int port) {
        System.out.println("Connection open");
        return false;
    }

    @Override
    public boolean send(byte[] message, int length) {
        return false;
    }

    @Override
    public boolean close() {
        System.out.println("Connection closed");
        return false;
    }
}

package com.sda.javabyd3.mizi.designPattern.facade;

import java.net.InetAddress;

public class ConnectionImp1 implements Connection {

    @Override
    public boolean open(InetAddress address, int port) {
        return false;
    }

    @Override
    public boolean send(byte[] message, int length) {
        return false;
    }

    @Override
    public boolean close() {
        return false;
    }
}

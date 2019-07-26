package com.sda.javabyd3.migr.designpattern.facade;

import java.net.InetAddress;

public class ConectionImpl implements Conection {
    @Override
    public boolean open(InetAddress address, int port) {
        return false;
    }

    @Override
    public boolean send(byte[] message, int lenght) {
        return false;
    }

    @Override
    public boolean close() {
        return false;
    }
}

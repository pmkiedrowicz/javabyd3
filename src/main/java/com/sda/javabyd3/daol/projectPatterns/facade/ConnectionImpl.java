package com.sda.javabyd3.daol.projectPatterns.facade;

import java.net.InetAddress;

public class ConnectionImpl implements Connection {
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

package com.sda.javabyd3.mizi.designPattern.facade;

import java.net.InetAddress;

public interface Connection {

    boolean open(InetAddress address, int port);

    boolean send(byte[] message, int length);

    boolean close();
}

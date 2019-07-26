package com.sda.javabyd3.urdu.designPattern.facade;

import java.net.InetAddress;

public interface Connection {

    boolean open(InetAddress adress, int port);

    boolean send(byte[] message, int length);

    boolean close();
}

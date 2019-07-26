package com.sda.javabyd3.jaja.designePattern.facade;

import java.net.InetAddress;

public interface Connection {

    boolean open(InetAddress adress, int port);

    boolean send(byte[] message, int length);

    boolean close();
}

package com.sda.javabyd3.daol.projectPatterns.facade;

import java.net.InetAddress;

public interface Connection {

    boolean open(InetAddress address, int port);

    boolean send(byte[] message, int lenght);

    boolean close();
}

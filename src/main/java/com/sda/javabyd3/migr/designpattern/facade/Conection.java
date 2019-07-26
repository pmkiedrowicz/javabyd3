package com.sda.javabyd3.migr.designpattern.facade;

import java.net.InetAddress;

public interface Conection {
    boolean open(InetAddress address, int port);

    boolean send(byte[] message, int lenght);

    boolean close();
}

package com.sda.javabyd3.migr.designpattern.adapter;

public class Email {
    public boolean conncet() {
        System.out.println("Connect");
        return true;
    }

    public boolean authorize(String login, String password) {
        System.out.println(String.format("Authorize: 1:%s, p:%s", login, password));
        return true;
    }

    public boolean sendMessage(String msg) {
        System.out.println("send message: ".concat(msg));
        return true;
    }

    public boolean disconnect() {
        System.out.println("disconnect");
        return true;
    }
}

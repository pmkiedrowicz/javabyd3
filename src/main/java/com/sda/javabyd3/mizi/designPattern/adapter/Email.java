package com.sda.javabyd3.mizi.designPattern.adapter;

public class Email {
    public boolean connect(){
        System.out.println("Connsect");
        return true;
    }

    public boolean authorize (String login, String password){
        System.out.println(String.format("Authorize: l:%s, p:%s", login, password));
        return true;
    }

    public boolean sendMessage(String msg){
        System.out.println("Send message: ".concat(msg));
        return true;
    }

    public boolean disconnect(){
        System.out.println("Disconnect");
        return true;
    }
}

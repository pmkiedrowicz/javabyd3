package com.sda.javabyd3.kawa.exg012.ex04;

public class Main {
    public static void main(String[] args) {

        Message message1 = new SmsMessage();
        Message message2 = new EmailMessage();

        message1.messageType("sms: asdsad mdsmadm asdmk sadm samd");
        message2.messageType("emai: sdsssssdadsadsadsadasdasdaddadadadsadd");

        GenericMessageSender genericMessageSender1 = new SmsSender();
        GenericMessageSender genericMessageSender2 = new EmailSender();
        genericMessageSender1.sendMessage(message1);
        genericMessageSender2.sendMessage(message2);
    }
}

package com.sda.javabyd3.mizi.exg012.ex04;

/**
 * Created by Michal Ziolecki.
 */
public class Main04 {
    public static void main(String[] args) {
        Message message1 = new SmsMessage();
        Message message2 = new EmailMessage();
        message1.messageToSend( "sms" );
        message2.messageToSend( "mail" );

        GenericInterfaceEx04 mailSender = new EmailSender();
        GenericInterfaceEx04 smsSender = new SmsSender();
        smsSender.sendMessage( message1 );
        mailSender.sendMessage( message2 );
    }
}

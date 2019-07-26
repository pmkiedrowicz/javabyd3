package com.sda.javabyd3.mizi.exg012.ex04;

/**
 * Created by Michal Ziolecki.
 */
public class EmailSender implements GenericInterfaceEx04 {

    @Override
    public void sendMessage(Object object){

        System.out.println("message: " + String.valueOf( object.toString() ));
    }
}

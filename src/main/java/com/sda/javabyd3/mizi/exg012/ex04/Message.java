package com.sda.javabyd3.mizi.exg012.ex04;

/**
 * Created by Michal Ziolecki.
 */
public class Message<T>{

    private T messageField ;

    public void messageToSend(T object){
        this.messageField = object;
    }

    @Override
    public String toString(){
        return  "" + messageField;
    }
}

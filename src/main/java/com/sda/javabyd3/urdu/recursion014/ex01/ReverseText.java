package com.sda.javabyd3.urdu.recursion014.ex01;


public class ReverseText {

    public String backwards(String text, int length){

        if(length>=0){

            return text.charAt(length)+ backwards(text, length-1);
        }
        return "";
    }

    public String backLoop(String text){
        String reverse = "";
        for(int i= text.length()-1;i>=0;i--){
            reverse+=text.charAt(i);
        }
        return  reverse;
    }
}

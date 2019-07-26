package com.sda.javabyd3.syga.exg007.ex01;

public class ConvertForCelsius {
    public ConvertForCelsius(){

    }

    public double convertForCelsius(double temp){
        temp = (temp-32)/1.8;
        return temp;
    }
}

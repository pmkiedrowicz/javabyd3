package com.sda.javabyd3.urdu.exg007.ex01;

public class ConvertTemperature {

    public double convertToFahrenheit(double temp){

        double result=32d+((9d/5d)*temp);

        return result;
    }

    public double convertToCelcius(double temp){

        double result=(5d/9d)*(temp-32d);

        return result;
    }
}

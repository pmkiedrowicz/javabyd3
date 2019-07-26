package com.sda.javabyd3.jaja.exg009.ex05.pisemnie;

public class Calculator {

    public double sum(double a, double b){
       double result = a  +  b;
       return result;
    }

    public double subtract(double a,double b){
        double result = a - b;
        return result;
    }

    public double multiply(double a, double b){
        double result = a*b;
        return result;
    }
    public double divide (double a, double b){
        double result = a/b;
        return result;
    }
    public double exponentiation (double a, double b){
        double result = Math.pow(a,b);
        return result;
    }
}

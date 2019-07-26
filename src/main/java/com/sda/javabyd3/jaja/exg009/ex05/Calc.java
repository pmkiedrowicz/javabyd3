package com.sda.javabyd3.jaja.exg009.ex05;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Calc {

    public double sum(double a, double b){
        log.info("Sum!");
       double result = a  +  b;
       return result;
    }

    public double subtract(double a,double b){
        log.info("Substract!");
        double result = a - b;
        return result;
    }

    public double multiply(double a, double b){
        log.info("Multiply!");
        double result = a*b;
        return result;
    }
    public double divide (double a, double b){
        log.info("Divide!");
        double result = a/b;
        return result;
    }
    public double exponentiation (double a, double b){
        log.info("Exponentiation!");
        double result = Math.pow(a,b);
        return result;
    }
}

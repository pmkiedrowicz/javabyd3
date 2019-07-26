package com.sda.javabyd3.urdu.exg009.ex05;

/**
 * Method that calculate sum, substract, divide, multiply and exponentiation of two numbers.
 */
public class Calculator {


    public Integer sum(Integer a, Integer b) {

        return a + b;
    }

    public Integer substract(Integer a, Integer b) {
        return a - b;
    }

    public Integer multiply(Integer a, Integer b) {
        return a * b;
    }

    public Float divide(Integer a, Integer b) throws Exception {
        if (b == 0)
            throw new Exception("Can not divide by 0");
        return (float) a / (float) b;
    }

    public double pow(Integer a, Integer b){

        return Math.pow(a,b);
    }
}

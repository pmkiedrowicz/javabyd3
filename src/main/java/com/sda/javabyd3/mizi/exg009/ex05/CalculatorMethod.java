package com.sda.javabyd3.mizi.exg009.ex05;

import lombok.extern.slf4j.Slf4j;

/**
 * Created by Michal Ziolecki.
 */
@Slf4j
public class CalculatorMethod {

    public int sum(int number1, int number2)
    {
        log.info( "Now, I sum two numbers" );
        int sumTwoNumbers = number1 + number2;

        return sumTwoNumbers;
    }

    public int substract(int number1, int number2)
    {
        log.info( "Now, I substract two numbers" );
        int substractTwoNumbers = number1 - number2;

        return substractTwoNumbers;
    }

    public int multiply(int number1, int number2)
    {
        log.info( "Now, I multiply two numbers" );
        int multiplyTwoNumbers = number1 * number2;

        return  multiplyTwoNumbers;
    }

    public double divide(int number1, int number2){

        log.info( "Now, I divide two numbers" );
        double divideTwoNumbers = (number1/(double)number2);

        return  divideTwoNumbers;
    }


}

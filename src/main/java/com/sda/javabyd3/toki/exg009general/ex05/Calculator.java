package com.sda.javabyd3.toki.exg009general.ex05;

import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@NoArgsConstructor
@Slf4j
public class Calculator {

    private double result = 0;

    public double sum(double a, double b) {
        result = a + b;
        log.info("Sum of " + a + " " + b + "=" + result);
        return result;
    }

    public double substract(double a, double b) {
        result = a - b;
        log.info("Substract of " + a + " " + b + "=" + result);
        return result;
    }

    public double multiply(double a, double b) {
        result = a * b;
        log.info("Multiply of " + a + " " + b + "=" + result);
        return result;
    }

    public double divide(double a, double b) {
        result = a / b;
        log.info("Divide of " + a + " " + b + "=" + result);
        return result;
    }

    public double involution(double a, double b) {
        result = Math.pow(a, b);
        log.info("Involution of " + a + " " + b + "=" + result);
        return result;
    }
}

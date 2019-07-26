package com.sda.javabyd3.toki.exg003general.general.ex02;

public class PrimeChecker {
    public Boolean number(Integer numberForPrime) {

        boolean result = true;
        if (numberForPrime < 2) {
            return false;
        } else for (int j = 2; j <= numberForPrime/2; j++) {
            if (numberForPrime % j == 0) {
                return false;
            }
            break;
        }

        System.out.println("Number " + numberForPrime + (result == true ? " is" : " is not") + " prime number");
        return false;
    }
}
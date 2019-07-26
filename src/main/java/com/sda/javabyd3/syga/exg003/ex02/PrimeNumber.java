package com.sda.javabyd3.syga.exg003.ex02;

public class PrimeNumber {
    public Boolean CheckNumber(Integer number) {

            boolean result = true;
            if (number < 2) {
                result = false;
            } else for (int j = 2; j <= number / 2; j++) {
                if (number % j == 0) {
                    result = false;
                    break;
                }
            }

            System.out.println("Liczba " + number + (result == true ? " jest" : " nie jest") + " liczbą pierwszą");
        return true;
    }
}


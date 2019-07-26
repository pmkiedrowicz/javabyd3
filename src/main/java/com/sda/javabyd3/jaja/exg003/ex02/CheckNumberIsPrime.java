package com.sda.javabyd3.jaja.exg003.ex02;

public class CheckNumberIsPrime {

    public boolean primeNumbers(int one) {
        if (one < 2) {
//            System.out.println("Podana liczba " + one + " nie jest liczbą pierwsza.");
            return false;
        }
        for (int i = 2; i * i <= one; i++) {
            if (one % i == 0) {
//                System.out.println("Podana liczba " + one + " nie jest liczbą pierwsza.");
                return false;
            }
        }
//        System.out.println("Podana liczba " + one + " jest liczbą pierwsza");
        return true;
    }
}



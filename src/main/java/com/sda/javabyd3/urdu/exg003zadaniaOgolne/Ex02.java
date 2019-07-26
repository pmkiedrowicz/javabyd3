package com.sda.javabyd3.urdu.exg003zadaniaOgolne;

public class Ex02 {
    public boolean primeNumbers2(int one) {

        if (one < 2) {
            System.out.println("Liczba nie jest pierwsza.");
            return false;
        }
        for (int i = 2; i * i <= one; i++) {
            if (one % i == 0) {

                System.out.println("Liczba nie jest pierwsza.");
                return false;
            }
        }
        System.out.println("Liczba jest pierwsza");
        return true;
    }
}

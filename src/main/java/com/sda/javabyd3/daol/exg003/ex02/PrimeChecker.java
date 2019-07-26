package com.sda.javabyd3.daol.exg003.ex02;

public class PrimeChecker {
    public boolean primeNumbers(int one) {
        if (one < 2) {
//            System.out.println("Liczba " + one + " nie jest liczbą pierwszą.");
            return false;
        }
        for (int i = 2; i * i <= one; i++) {
            if (one % i == 0) {
//                System.out.println("Liczba " + one + " nie jest liczbą pierwszą.");
            return false;
            }
        }
//        System.out.println("Liczba " + one + " jest liczbą pierwszą.");
return true;

    }
}

//
//    public static boolean test(int number) {
//        if (number < 2) return false;
//        for (int i = 2; i < number; i++) {
//            if (number % i == 0) {
//                return false;
//            }
//        }
//        return true;
//    }
//}


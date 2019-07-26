package com.sda.javabyd3.urdu.exg003zadaniaOgolne;

public class CheckPrimeNumbers {

    public boolean primeNumbers(int number) {

        if (number == 2 || number == 3) {
           // System.out.println("Podana Liczba " + number + " jest liczba pierwszą");
            return true;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
              //  System.out.println("Podana liczba " + number + " nie jest liczbą pierwszą");
                return false;
            }
        }
      //  System.out.println("Podana liczba " + number + " jest liczbą pierwsza");
        return true;
    }
}

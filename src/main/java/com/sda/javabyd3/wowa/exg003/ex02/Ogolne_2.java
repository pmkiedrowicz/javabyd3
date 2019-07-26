//Napisz program, który pobiera liczbę od użytkownika i sprawdza czy wprowadzona
//liczba jest liczbą pierwszą. Program wyświetla komunikat
//“Podana liczba <liczba> jest liczbą pierwszą”
//lub “Podana liczba <liczba> nie jest liczbą pierwszą”

package com.sda.javabyd3.wowa.exg003.ex02;

public class Ogolne_2 {
    public Boolean isPrime(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }
}

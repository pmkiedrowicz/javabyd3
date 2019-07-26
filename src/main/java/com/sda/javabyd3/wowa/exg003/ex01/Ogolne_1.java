//Napisz program, który pobiera liczbę od użytkownika i sprawdza czy podana liczba
//jest parzysta lub nieparzysta i wyświetla stosowny komunikat.

package com.sda.javabyd3.wowa.exg003.ex01;

public class Ogolne_1 {
    public Boolean evenOrOdd(int number) {
        if (number % 2 == 0) {
            return true;
        }
        return false;
    }
}

//Napisz program, który pobiera liczbę od użytkownika i sprawdza czy podana liczba
//jest parzysta lub nieparzysta i wyświetla stosowny komunikat.

package com.sda.javabyd3.wowa.exg003.Ogolne.ex01;

import com.sda.javabyd3.wowa.exg003.ex01.Ogolne_1;
import org.junit.Assert;
import org.junit.Test;

public class Ogolne_1Test {

    @Test
    public void isNumberOddOrEven() {
        Ogolne_1 zad1 = new Ogolne_1();
        int number = 5;
        Boolean result = zad1.evenOrOdd(number);
        Assert.assertTrue("method does not work correctly", result == false);
    }

    @Test
    public void isNumberEvenOrOdd() {
        Ogolne_1 zad1 = new Ogolne_1();
        int number = 4;
        Boolean result = zad1.evenOrOdd(number);
        Assert.assertTrue("method does not work correctly", result == true);
    }
}


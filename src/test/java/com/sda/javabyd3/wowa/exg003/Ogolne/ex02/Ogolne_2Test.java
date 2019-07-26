package com.sda.javabyd3.wowa.exg003.Ogolne.ex02;

import com.sda.javabyd3.wowa.exg003.ex02.Ogolne_2;
import org.junit.Assert;
import org.junit.Test;

public class Ogolne_2Test {
    @Test
    public void NumberIsPrime() {
        Ogolne_2 zad2 = new Ogolne_2();
        int number = 5;
        Boolean result = zad2.isPrime(number);
        Assert.assertTrue("method does not work correctly", result == true);
    }

    @Test
    public void NumberIsNotPrime() {
        Ogolne_2 zad2 = new Ogolne_2();
        int number = 4;
        Boolean result = zad2.isPrime(number);
        Assert.assertTrue("method does not work correctly", result == false);
    }
}

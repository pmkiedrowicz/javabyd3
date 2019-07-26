package com.sda.javabyd3.kawa.exg003.ogolne.ex02;

import com.sda.javabyd3.kawa.exg003.ogolne.ex02.CheckerIfNumbIsPrime;
import org.junit.Assert;
import org.junit.Test;

public class CheckerIfNumbIsPrimeTest {

    CheckerIfNumbIsPrime test = new CheckerIfNumbIsPrime();

    @Test
    public void checkIfPrimeTest(){
        Assert.assertTrue("Podana liczba nie jest liczba pierwsza",test.checkIfPrime(2)==true);
        Assert.assertTrue("Podana liczba jest liczba pierwsza",test.checkIfPrime(4)==false);
    }
}

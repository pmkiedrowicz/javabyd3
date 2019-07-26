package com.sda.javabyd3.mizi.exg003.ex04;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Michal Ziolecki.
 */
public class Zad4Test {
    @Test
    public void CheckZad4()
    {
        Zad4 zad4 = new Zad4();
        Assert.assertEquals( "Zazolc gesla jazn", zad4.toEngCharacters( "Zażółć gęślą jaźń" ) );

    }

}
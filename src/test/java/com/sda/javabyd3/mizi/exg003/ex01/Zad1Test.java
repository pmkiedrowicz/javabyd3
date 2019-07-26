package com.sda.javabyd3.mizi.exg003.ex01;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Michal Ziolecki.
 */
public class Zad1Test {
    @Test
    public void TestZad1()
    {
        Zad1 zad1 = new Zad1();
        Assert.assertTrue( "True for Xmod2", zad1.checkNumber( 6 ) );
    }

}
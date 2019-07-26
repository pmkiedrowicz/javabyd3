package com.sda.javabyd3.mizi.exg003.ex03;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Michal Ziolecki.
 */
public class Zad3Test {
    @Test
    public void TestZad3()
    {
        Zad3 zad = new Zad3();
        Assert.assertEquals( "fedcba", zad.reverseString( "abcdef" ) );
    }

}
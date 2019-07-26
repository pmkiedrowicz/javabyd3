package com.sda.javabyd3.mizi.exg003.ex02;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Michal Ziolecki.
 */
public class Zad2Test {

    @Test
    public void TestZad2()
    {
        Zad2 zad2 = new Zad2();
        Assert.assertTrue( "Test that number is primary", zad2.test( 3 ) );
    }

}
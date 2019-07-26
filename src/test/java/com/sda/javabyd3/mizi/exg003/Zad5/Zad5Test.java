package com.sda.javabyd3.mizi.exg003.Zad5;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Michal Ziolecki.
 */
public class Zad5Test {

    @Test
    public void CheckZad5()
    {
        Zad5 zad5 = new Zad5();
        Assert.assertTrue( zad5.checkPalindrome( "abccba" ) );
        Assert.assertTrue( zad5.checkPalindrome( "Może jutro ta dama da tortu jeżom" ) );
    }

}
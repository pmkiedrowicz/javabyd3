package com.sda.javabyd3.kawa.exg003.ogolne.ex01;

import com.sda.javabyd3.kawa.exg003.ogolne.ex01.CheckerIfNumbIsEven;
import org.junit.Assert;
import org.junit.Test;

public class CheckerIfNumbIsEvenTest {

    CheckerIfNumbIsEven test = new CheckerIfNumbIsEven();

    @Test
    public void checkingNumberTest (){
        Assert.assertTrue("podana liczba nie jest parzysta", test.checkingNumb(8)==true);
        Assert.assertTrue("podana liczba nie jest nieparzysta", test.checkingNumb(9)==false);
    }
}

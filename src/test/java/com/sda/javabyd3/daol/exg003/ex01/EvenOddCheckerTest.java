package com.sda.javabyd3.daol.exg003.ex01;

import org.junit.Assert;
import org.junit.Test;

public class EvenOddCheckerTest {


    @Test
    public void evenNumber () {
        EvenOddChecker evenOddChecker = new EvenOddChecker();
        Boolean result = evenOddChecker.checkerNumbers(14);
        Assert.assertTrue(result);
    }
    @Test
    public void oddNumber () {
        EvenOddChecker evenOddChecker = new EvenOddChecker();
        Boolean result = evenOddChecker.checkerNumbers(13);
        Assert.assertFalse(result);
    }
}

//Napisz program, który tworzy z podanego wyrazu lub zdania wyraz lub zdanie
//odwrotne czyli czytany wspak za pomocą rekurencji. Napisz również program bez
//rekurencji i porównaj czas wykonania.

package com.sda.javabyd3.wowa.exg014.ex01;

import org.junit.Assert;
import org.junit.Test;

public class ReverseStringTest {

    ReverseString rs = new ReverseString();

    @Test
    public void isReverseStringRecOk() {
        String toTest = "string to test";
        String expctd = "tset ot gnirts";
        Assert.assertEquals(expctd, rs.reverseStringRec(toTest, toTest.length() - 1));
    }

    @Test
    public void isReverseStringIterOk() {
        String toTest = "happy testing";
        String expctd = "gnitset yppah";
        Assert.assertEquals(expctd, rs.reverseStringIter(toTest));
    }
}

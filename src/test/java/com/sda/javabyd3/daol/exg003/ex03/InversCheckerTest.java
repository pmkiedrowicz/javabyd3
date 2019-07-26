package com.sda.javabyd3.daol.exg003.ex03;

import org.junit.Assert;
import org.junit.Test;

public class InversCheckerTest {
    @Test
    public void isWordInvers() {
        InversChecker checker = new InversChecker();
        String result = checker.wordInvers("Daniel");
        Assert.assertTrue(result.equals("leinaD"));
        String result2 = checker.wordInvers(" ");
        Assert.assertTrue(result2.equals(" "));
        String result3 = checker.wordInvers("Da niel");
        Assert.assertTrue(result3.equals("lein aD"));

    }
}
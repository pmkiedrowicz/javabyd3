package com.sda.javabyd3.kawa.exg013.ex01;

import org.codehaus.jackson.annotate.JsonTypeInfo;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class IsntNullCheckerTest {

    IsntNullChecker test = new IsntNullChecker();

    @Test
    public void checkingIfObiectIsntNull() {
        String arg = "adsd";
        Assert.assertTrue(test.checkingIfObiectIsntNull(arg));
        Assert.assertFalse(test.checkingIfObiectIsntNull(null));
    }
}
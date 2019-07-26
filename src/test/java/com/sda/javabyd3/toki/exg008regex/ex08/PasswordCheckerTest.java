package com.sda.javabyd3.toki.exg008regex.ex08;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PasswordCheckerTest {
    PasswordChecker passwordChecker = new PasswordChecker();

    @Test
    public void validate() {
        String passForTrue = "aaAA5$2d";
        String passForTrue2 = "Ta5@f@dT";

        Assert.assertTrue(passwordChecker.validate(passForTrue));
        Assert.assertTrue(passwordChecker.validate(passForTrue2));

        String passForFalse = "ffGG8%";
        String passForFalse2 = "ffGG8&ffGG8&ffGG83f2";

        Assert.assertFalse(passwordChecker.validate(passForFalse));
        Assert.assertFalse(passwordChecker.validate(passForFalse2));
    }
}
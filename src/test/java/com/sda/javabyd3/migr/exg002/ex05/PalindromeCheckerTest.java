package com.sda.javabyd3.migr.exg002.ex05;

import org.junit.Assert;
import org.junit.Test;

public class PalindromeCheckerTest {

    @Test
    public void isPalindrome() {
        PalindromeChecker test = new PalindromeChecker();
        Assert.assertTrue("method isPalindrome does not work correctly", test.isPalindrome("kajak"));
        Assert.assertTrue("method isPalindrome does not work correctly", !test.isPalindrome("dupa"));

    }
}
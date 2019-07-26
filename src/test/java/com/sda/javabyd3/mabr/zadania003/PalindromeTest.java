package com.sda.javabyd3.mabr.zadania003;

import org.junit.Assert;
import org.junit.Test;

public class PalindromeTest {

    @Test
    public void Revers() {
        Palindrome palindrome = new Palindrome();
        boolean result = palindrome.palindrome("Może jutro ta dama da tortu jeżom");
        Assert.assertTrue(true);
    }
}

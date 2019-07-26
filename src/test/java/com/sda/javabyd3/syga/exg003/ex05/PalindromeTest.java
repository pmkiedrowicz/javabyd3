package com.sda.javabyd3.syga.exg003.ex05;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {

    @Test
    public void shouldShowTrueIfTextIsPalindrome(){
        Palindrome palindrome = new Palindrome();
        Boolean result = palindrome.palindromeText("kajak");
        Assert.assertTrue("PrimeNumber does not work correctly. Expercterd true but was " + result, result == true);
    }

}
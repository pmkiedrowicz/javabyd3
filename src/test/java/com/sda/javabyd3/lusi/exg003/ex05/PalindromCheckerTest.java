package com.sda.javabyd3.lusi.exg003.ex05;

import com.sda.javabyd3.lusi.exg003.ex03.Reverse;
import com.sda.javabyd3.lusi.exg003.ex03.ReverseImpl;
import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.Matchers.is;

public class PalindromCheckerTest {

    @Test
    public void isPalindrom() {
        Reverse reverse = new ReverseImpl();
        PalindromChecker palindromChecker = new PalindromChecker(reverse);
        Assert.assertThat(palindromChecker.isPalindrom("kajak"), is(true));
    }

    @Test
    public void isPalindromLong() {
        Reverse reverse = new ReverseImpl();
        PalindromChecker palindromChecker = new PalindromChecker(reverse);
        Assert.assertThat(palindromChecker.isPalindrom("Może jutro ta dama da tortu jeżom"), is(true));
    }
}
package com.sda.javabyd3.toki.exg003general.general.ex05;

import junit.framework.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class PalindromCheckerTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void checkForPalindrom(){
        PalindromChecker palindromChecker=new PalindromChecker();
        Assert.assertEquals("Palindrom does not work correctly. Expected mozejutrotadamadatotujeżom"+palindromChecker,"możejutrotadamadatortujeżom", palindromChecker.checkForPalindrom("Może jutro ta dama da tortu jeżom",""));
    }

}
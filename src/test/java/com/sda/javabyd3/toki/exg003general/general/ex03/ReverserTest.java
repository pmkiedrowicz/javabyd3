package com.sda.javabyd3.toki.exg003general.general.ex03;

import junit.framework.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ReverserTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void itShouldReverseText(){
        Reverser reverser=new Reverser();
        Assert.assertEquals("Reverser does not work correctly. Expected 'akłóżgezrg' but was "+reverser,"akłóżgezrg", reverser.textToReverse("grzegżółka"));
    }

}
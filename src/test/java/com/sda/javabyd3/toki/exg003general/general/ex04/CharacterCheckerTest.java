package com.sda.javabyd3.toki.exg003general.general.ex04;

import junit.framework.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class CharacterCheckerTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void expectingNoPolishWords(){
        CharacterChecker characterChecker=new CharacterChecker();
        Assert.assertEquals("CharacterChecker does not work correctly. Expected 'Zazolc gesla jazn'"+characterChecker,"Zazolc gesla jazn",characterChecker.changeCharacter("Zażółć gęślą jaźń"));
    }

}
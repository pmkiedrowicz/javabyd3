package com.sda.javabyd3.lusi.introduction.unittests.ex23;

import com.sda.javabyd3.lusi.introduction.regularexpression.ex04.WordValidator;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class AlaValidatorTest {

    @Test
    public void verifyAlaWorld() {
        WordValidator wordValidator = new WordValidator();
        assertTrue(wordValidator.isValid("jdjdjdalaska"));
        assertTrue(wordValidator.isValid("jdjdjdala"));
        assertTrue(wordValidator.isValid("alaska"));
    }

    @Test
    public void verifyInvalidAlaWord() {
        WordValidator wordValidator = new WordValidator();
        assertFalse(wordValidator.isValid("jdjdjdallaska"));
        assertFalse(wordValidator.isValid("a1a"));
        assertFalse(wordValidator.isValid("hfyru4a4la"));
    }
}

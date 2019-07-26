package com.sda.javabyd3.lusi.introduction.unittests.ex22;

import com.sda.javabyd3.lusi.introduction.regularexpression.ex02.PostCodeValidator;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PostCodeTest {

    @Test
    public void verifyCorrectPostCode() {
        PostCodeValidator postCodeValidator = new PostCodeValidator();
        assertTrue(postCodeValidator.isPostodeValid("85-740"));
        assertTrue(postCodeValidator.isPostodeValid("99-999"));
        assertTrue(postCodeValidator.isPostodeValid("00-000"));
    }

    @Test
    public void verifyInvalidPostCode() {
        PostCodeValidator postCodeValidator = new PostCodeValidator();
        assertFalse(postCodeValidator.isPostodeValid("01-00b"));
        assertFalse(postCodeValidator.isPostodeValid("00-0000"));
        assertFalse(postCodeValidator.isPostodeValid("85740"));
    }
}

package com.sda.javabyd3.kawa.exg003.ogolne.ex03;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TextReverserTest {

    TextReverser test = new TextReverser();

    @Test
    public void reversingText() {
        Assert.assertNotEquals("error", test.reversingText("ereasd").equals("dsaere"));
    }
}
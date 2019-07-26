package com.sda.javabyd3.kawa.exg014.ex01;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class WordsReverserTest {

    WordsReverser test = new WordsReverser();

    @Test
    public void reversingWords() {
        String testWord = "Lubie placki!";
        int testWordLength = testWord.length() - 1;
        String expectedWord = "!ikcalp eibuL";
        Assert.assertEquals(test.reversingWords(testWord, testWordLength), expectedWord);
    }
}
package com.sda.javabyd3.kawa.exg007.ex03;

import org.junit.Test;

import static org.junit.Assert.*;

public class SumMyNumersTest {

    SumMyNumers test = new SumMyNumers();

    @Test
    public void summingMyNumbers() {
        int expNumb = 50;
        assertEquals(expNumb,test.summingMyNumbers(10,20,5,15));
    }
}
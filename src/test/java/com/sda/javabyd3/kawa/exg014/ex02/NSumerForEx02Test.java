package com.sda.javabyd3.kawa.exg014.ex02;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class NSumerForEx02Test {

    NSumerForEx02 test = new NSumerForEx02();

    @Test
    public void summingNTimes() {
        int number = 34;
        assertEquals(595, test.summingNTimes(number));
    }

    @Test
    public void summingNTimesWithForLoop() {
        int number = 34;
        assertEquals(595, test.summingNTimesWithForLoop(number));
    }
}
//Napisz program, który oblicza n-ty wyraz silni za pomocą rekurencji. Napisz również
//program bez rekurencji i porównaj czas wykonania.

package com.sda.javabyd3.wowa.exg014.ex03;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class FactorialRecurrTest {

    FactorialRecurr fr = new FactorialRecurr();

    @Test
    public void calculateFactorialRecurr() {
        assertEquals(1L, fr.calculateRecurr(0));
        assertEquals(1L, fr.calculateRecurr(1));

        long result = fr.calculateRecurr(5);
        assertThat(result, is(120L));
    }

    @Test
    public void calculateFactorialIter() {
        assertEquals(1L, fr.calculateRecurr(0));
        assertEquals(1L, fr.calculateRecurr(1));

        long result = fr.calculateIter(7);
        assertThat(result, is(5040L));
    }
}

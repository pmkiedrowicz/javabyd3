//Napisz, program, który dla podanej liczby całkowitej n oblicza sumę wyrazów od 0-n
//za pomocą rekurencji. Napisz również program bez rekurencji i porównaj czas
//wykonania.

package com.sda.javabyd3.wowa.exg014.ex02;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;

public class SumRecurrTest {

    SumRecurr sr = new SumRecurr();

    @Test
    public void sumRecurr() {
        int result = sr.sumRecurr(25);
        Assert.assertThat(result, is(325));
    }

    @Test
    public void sumIter() {
        int result = sr.sumIter(26);
        Assert.assertThat(result, is(351));
    }
}
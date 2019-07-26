package com.sda.javabyd3.wowa.exg014.ex04;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FibboTest {

    Fibbo f = new Fibbo();

    @Test
    public void isFibboRecurrOk() {
        int result = f.FibboRecurr(13);
        assertThat(result, is(233));
    }

    @Test
    public void isFibboIterOk() {
        int result = f.FibboIter(16);
        assertThat(result, is(987));
    }
}

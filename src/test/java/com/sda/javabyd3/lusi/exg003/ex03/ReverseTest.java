package com.sda.javabyd3.lusi.exg003.ex03;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.Matchers.is;

public class ReverseTest {

    @Test
    public void reverseString() {
        Assert.assertThat(new ReverseImpl().reverseString("java"), is("avaj"));
    }
}
package com.sda.javabyd3.wowa.exg004StreamLambda.ex02;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;

public class Stream_2Test {
    @Test
    public void isMinValueOk() {
        Stream_2 zad2 = new Stream_2();
        int array[] = {3, 5, 8, 88, 32, -2};
        int result = -2;
        Assert.assertThat(zad2.minValue(array), is(result));
    }
}

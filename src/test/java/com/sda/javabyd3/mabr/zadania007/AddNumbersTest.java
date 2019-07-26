package com.sda.javabyd3.mabr.zadania007;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;

public class AddNumbersTest {
    @Test
    public void addNumbers() throws Exception {
        AddNumbers addNumbers = new AddNumbers();
        Integer result = 15;
        Assert.assertThat(result, is(addNumbers.addNumbers(1, 2, 3, 4, 5)));
    }
}

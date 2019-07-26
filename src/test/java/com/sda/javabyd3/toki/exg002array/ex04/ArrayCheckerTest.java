package com.sda.javabyd3.toki.exg002array.ex04;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayCheckerTest {
    ArrayChecker arrayChecker=new ArrayChecker();

    @Test
    public void equals() {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 2, 3, 4, 5};
        int[] array3 = {1, 2, 3, 5, 4};
        Assert.assertTrue(String.valueOf(true),arrayChecker.equals(array1,array2));
    Assert.assertFalse(String.valueOf(false),arrayChecker.equals(array1,array3));
    }
}
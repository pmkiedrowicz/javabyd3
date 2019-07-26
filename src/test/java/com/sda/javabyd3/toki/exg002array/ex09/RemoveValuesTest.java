package com.sda.javabyd3.toki.exg002array.ex09;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class RemoveValuesTest {
RemoveValues removeValues=new RemoveValues();
    @Test
    public void removeValues() {
        int[] initArray={2,7,5,8,0,5,6};
        int[] removeArray={5,6};
        int[] resutArray={2,7,8,0};
        Assert.assertEquals(Arrays.toString(resutArray),Arrays.toString(removeValues.removeValues(initArray,removeArray)));
    }
}
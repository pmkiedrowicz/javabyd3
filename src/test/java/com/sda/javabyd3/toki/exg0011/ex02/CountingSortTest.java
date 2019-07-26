package com.sda.javabyd3.toki.exg0011.ex02;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.HashMap;

public class CountingSortTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void doesItSortAllRight() {
        CountingSort countingSort = new CountingSort();
        int[] tab = {4, 6, 4, 5};
        int[] result = {4, 4, 5, 6};
        HashMap hashMap=new HashMap();
        hashMap.put(0,0);
        hashMap.put(1,0);
        hashMap.put(2,0);
        hashMap.put(3,0);
        hashMap.put(4,2);
        hashMap.put(5,1);
        hashMap.put(6,1);
        Assert.assertEquals("mess",hashMap,countingSort.countIt(tab));

    }
}
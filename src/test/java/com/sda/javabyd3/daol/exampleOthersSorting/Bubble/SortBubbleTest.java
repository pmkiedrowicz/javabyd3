package com.sda.javabyd3.daol.exampleOthersSorting.Bubble;

import org.junit.Assert;
import org.junit.Test;

public class SortBubbleTest {

    @Test
    public void sortBubble() {
        SortBubble sortBubble = new SortBubble();
        int[] numbers = {2,6,8,4,5,6,3,7};
        int[] sort = {2,3,4,5,6,6,7,8};
        int[] result = sortBubble.sortBubble(numbers);
        Assert.assertArrayEquals(sort,result);
    }

//    @Test
//            public void
//    SortBubble sortBubble = new SortBubble();
//    int[] numbers = {}
}
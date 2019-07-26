package com.sda.javabyd3.daol.exg014.ex01;

import org.junit.Assert;
import org.junit.Test;

public class BackwardsTest {

    @Test
    public void backwards() {
        Backwards backwards = new Backwards();
        String result = Backwards.backwards("daniel", 5);
        Assert.assertEquals(result, "leinad");
    }
}
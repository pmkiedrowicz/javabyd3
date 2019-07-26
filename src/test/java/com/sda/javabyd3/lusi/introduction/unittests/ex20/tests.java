package com.sda.javabyd3.lusi.introduction.unittests.ex20;

import org.junit.Assert;
import org.junit.Test;

public class tests {

    @Test
    public void checkVovelsCounters() {
        String text = "zażółć gęślą jaźń";
        Assert.assertEquals(5, new WordStatistic().countVovels(text));
        text = "qwertyuiopasdfghjklzxcvbnm";
        Assert.assertEquals(6, new WordStatistic().countVovels(text));
    }

    @Test
    public void checkConsonantsCounters() {
        String text = "zażółć gęślą jaźń";
        Assert.assertEquals(10, new WordStatistic().countConsonants(text));
        text = "qwertyuiopasdfghjklzxcvbnm";
        Assert.assertEquals(20, new WordStatistic().countConsonants(text));
    }
}

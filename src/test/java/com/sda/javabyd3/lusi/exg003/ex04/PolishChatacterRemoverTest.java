package com.sda.javabyd3.lusi.exg003.ex04;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.Matchers.is;

public class PolishChatacterRemoverTest {

    @Test
    public void remove() {
        Assert.assertThat(new PolishCharacterRemover().remove("zażółć gęślą jaźń"), is("zazolc gesla jazn"));
        Assert.assertThat(new PolishCharacterRemover().remove("ZAŻÓŁĆ GĘŚLĄ JAŹŃ"), is("ZAZOLC GESLA JAZN"));
    }

    @Test
    public void performance() {
        String text = "Zazółć gęślą jaźńZazółć gęślą jaźńZazółć gęślą jaźńZazółć gęślą jaźńZazółć gęślą jaźńZazółć gęślą jaźńZazółć gęślą jaźńZazółć gęślą jaźńZazółć gęślą jaźńZazółć gęślą jaźń";
        Integer tries = 1000000;
        PolishCharacterRemover polishCharacterRemover = new PolishCharacterRemover();

        long start = System.currentTimeMillis();
        for (int i = 0; i < tries; i++) {
            polishCharacterRemover.remove(text);
        }
        long end = System.currentTimeMillis();
        System.out.println("Remove using StringBuilder: " + (end - start) + " ms");

        start = System.currentTimeMillis();
        for (int i = 0; i < tries; i++) {
            polishCharacterRemover.remove2(text);
        }
        end = System.currentTimeMillis();
        System.out.println("Remove using replace: " + (end - start) + " ms");

        start = System.currentTimeMillis();
        for (int i = 0; i < tries; i++) {
            polishCharacterRemover.remove3(text);
        }
        end = System.currentTimeMillis();
        System.out.println("Remove using Apache lang3: " + (end - start) + " ms");

    }
}
package com.sda.javabyd3.wowa.exg003.Ogolne.ex04;

import com.sda.javabyd3.wowa.exg003.ex04.Ogolne_4;
import org.junit.Assert;
import org.junit.Test;

public class Ogolne_4Test {
    @Test
    public void isRemoveAccentsOk() {
        Ogolne_4 zad4 = new Ogolne_4();
        String text = "Żdąńię bęż polśkich zńaków";
        String result = zad4.removeAccents(text);
        Assert.assertTrue("removing polish accents does not work", "Zdanie bez polskich znakow".equals(result));
    }
}

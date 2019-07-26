//Napisz program konwertujący temperaturę o C<=>F. Przygotuj klasę konwertującą
//temperaturę i wykorzystaj ją w Main. Przygotuj testy jednostkowe sprawdzające
//konwersję temperatury na F i na C.

package com.sda.javabyd3.wowa.exg007.ex01;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;

public class TempConverterTest {
    @Test
    public void isCelcToFahrOK() {
        TempConverter t = new TempConverter();
        double tempC = 25;
        double result = t.celcToFahr(tempC);
        Assert.assertTrue("method does not work correctly", result == 77);
    }

    @Test
    public void isFahrToCelcOk() {
        TempConverter t = new TempConverter();
        double tempF = 25;
        double result = t.fahrToCelc(tempF);
        Assert.assertThat(result, is(-3.888888888888889));
    }
}

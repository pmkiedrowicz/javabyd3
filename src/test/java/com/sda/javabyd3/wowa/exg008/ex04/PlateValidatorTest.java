//Przygotuj aplikację sprawdzającą czy podany numer tablicy rejestracyjnej jest
//poprawny. Przygotuj klasę o nazwie PlateValidator posiadającą metodę
//public boolean validate(String plate);
//Na potrzeby zadania przyjmij, że tablica rejestracyjną jest poprawna gdy zawiera 2
//litery, a następnie 5 cyfr lub 4 cyfry i jedna litery lub 3 cyfry i 2 litery.
//Poprawny numer tablicy rejestracyjnej to: CB3456J, CB34212, WY640WI
//Błędny numer tablicy rejestracyjnej to: CBS3456, W1234YU, CC14WYG

package com.sda.javabyd3.wowa.exg008.ex04;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;

public class PlateValidatorTest {
    PlateValidator pv = new PlateValidator();

    @Test
    public void isPlateNumberOneLetterOk() {
        boolean result = pv.validate("CB3456J");
        Assert.assertThat(result, is(true));
    }

    @Test
    public void isPlateNumberAllNumbersOk() {
        boolean result = pv.validate("CB34212");
        Assert.assertThat(result, is(true));
    }

    @Test
    public void isPlateNumberTwoLettersOk() {
        boolean result = pv.validate("WY640WI");
        Assert.assertThat(result, is(true));
    }

    @Test
    public void isPlateNumberStartsWith3LettersNotValid() {
        String plate = "CBS3456";
        Assert.assertFalse(plate, pv.validate(plate));
    }

    @Test
    public void isPlateNumberStartsWith1LetterNotValid() {
        String plate = "W1234YU";
        Assert.assertFalse(plate, pv.validate(plate));
    }

    @Test
    public void isPlateNumberEndsWith3LetterNotValid() {
        String plate = "CC14WYG";
        Assert.assertFalse(plate, pv.validate(plate));
    }
}

//Przygotuj aplikację weryfikującą czy wprowadzone przez użytkownika hasło jest
//poprawne. Założenia dotyczące hasła:
//Hasło składa składa się z co najmniej 8 i nie więcej niż 16 znaków
//Hasło zawiera co najmniej 2 małe literę.
//Hasło zawiera co najmniej 2 duże literę.
//Hasło zawiera co najmniej jedną cyfrę
//Hasło zawiera co najmniej jeden znak specjalny

package com.sda.javabyd3.wowa.exg008.ex08;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;

public class PassValidatorTest {
    PassValidator pv = new PassValidator();

    @Test
    public void isPassCorrect() {
        boolean result1 = pv.validate("HaSlonumer44#");
        boolean result2 = pv.validate("12345AK43a(r");
        boolean result3 = pv.validate("$lastPaS55##");

        Assert.assertThat(result1, is(true));
        Assert.assertThat(result2, is(true));
        Assert.assertThat(result3, is(true));
    }

    @Test
    public void isPassInCorrect() {
        String pass1 = "Haslonumer44#";
        String pass2 = "12345Ak43a(r";
        String pass3 = "passwordTOtest4";

        Assert.assertFalse(pass1, pv.validate(pass1));
        Assert.assertFalse(pass2, pv.validate(pass2));
        Assert.assertFalse(pass3, pv.validate(pass3));
    }
}

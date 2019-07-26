//Przygotuj metodę zwracającą długość podanego przez użytkownika tekstu
//korzystając z obiektu Optional nie wykorzystując instrukcji warunkowej if.
//Podpowiedź:
//Korzystając z metody map pobierz długość tekstu. Jeśli zwrócona długość jest
//null to korzystając z metody orElse zwróć -1

package com.sda.javabyd3.wowa.exg013.ex02;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TextLengthTest {

    @Test
    public void isCheckLengthWithOptionalOk() {
        TextLength tl = new TextLength();
        int result1 = tl.checkLength("texttocheck");
        int result2 = tl.checkLength(null);
        int result3 = tl.checkLength("1234567");
        assertThat(result1, is(11));
        assertThat(result2, is(-1));
        assertThat(result3, is(7));
    }
}

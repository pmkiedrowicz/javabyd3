//Przygotuj metodę zwracającą długość podanego przez użytkownika tekstu
//korzystając z obiektu Optional nie wykorzystując instrukcji warunkowej if.
//Podpowiedź:
//Korzystając z metody map pobierz długość tekstu. Jeśli zwrócona długość jest
//null to korzystając z metody orElse zwróć -1

package com.sda.javabyd3.wowa.exg013.ex02;

import java.util.Optional;

public class TextLength {
    public int checkLength(String text) {
        return Optional.ofNullable(text)
                .map(t -> t.length())
                .orElse(-1);
    }
}

//Przygotuj metodę sprawdzającą czy podany przez użytkownika obiekt nie jest
//null korzystając z obiektu Optional.
//Podpowiedź: Wykorzystaj metodę ofNullable oraz isPresent.

package com.sda.javabyd3.wowa.exg013.ex01;

import java.util.Optional;

public class NullChecker {
    public <T> boolean whenNullReturnFalse(T value) {
        return Optional.ofNullable(value).isPresent();
    }
}

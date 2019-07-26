//Przygotuj metodę sprawdzającą czy podany przez użytkownika obiekt nie jest
//null korzystając z obiektu Optional.
//Podpowiedź: Wykorzystaj metodę ofNullable oraz isPresent.

package com.sda.javabyd3.wowa.exg013.ex01;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class NullCheckerTest {

    @Test
    public void checkIfNullWithOptional() {
        NullChecker nc = new NullChecker();
        assertTrue("method does not work correctly", nc.whenNullReturnFalse("text"));
        assertTrue("method does not work correctly", nc.whenNullReturnFalse(467));
        assertFalse("method does not work correctly", nc.whenNullReturnFalse(null));
    }
}

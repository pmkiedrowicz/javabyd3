//Przygotuj program dodający n liczb wprowadzonych przez użytkownika. Operacje
//dodawania powinny być w osobnej klasie. Metoda w klasie powinna zwracać sumę
//dodawania i przyjmować wiele argumentów. Skorzystaj z varargs. Nie przekazuj liczb
//do sumowania jako kolekcję. Napisz testy jednostkowe sprawdzające poprawność
//sumowania.

package com.sda.javabyd3.wowa.exg007.ex03;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;

public class SumNumbersVarArgsTest {
    @Test
    public void isSumNumbersVarArgsOk() {
        SumNumbersVarArgs s = new SumNumbersVarArgs();
        Integer result = 100;
        Assert.assertThat(result, is(s.sum(24, 24, 24, 24, 4)));
    }
}

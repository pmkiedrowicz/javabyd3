package com.sda.javabyd3.toki.exg014.ex03.check;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Factorial {

    public long factorial(long number) {

        long i;
        long temp = 1;

        for (i = 1; i <= number; i++) {
            temp *= i;
        }
        number = temp;

        return number;
    }

}

package com.sda.javabyd3.toki.exg014.ex03;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Factorial {

    public long factorial(long number) {
        if (number == 0) {
            return 1;
        } else {
            return number * factorial(number - 1);
        }
    }
}

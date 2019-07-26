package com.sda.javabyd3.toki.exg006interface.ex01.pizzaDough;

import com.sda.javabyd3.toki.exg006interface.ex01.interfaces.PizzaDough;

public class AllAmericanThin implements PizzaDough {

    @Override
    public void preparePizzaDough() {
        System.out.println("Preparing dough AllAmericanThin");
    }
}

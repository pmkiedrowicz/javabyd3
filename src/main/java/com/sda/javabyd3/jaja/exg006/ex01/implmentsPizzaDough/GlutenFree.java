package com.sda.javabyd3.jaja.exg006.ex01.implmentsPizzaDough;

import com.sda.javabyd3.jaja.exg006.ex01.PizzaDough;

public class GlutenFree implements PizzaDough {
    @Override
    public void preparePizzaDough() {
        System.out.println("Przygotwanie ciasta GlutenFree: ");
    }
}

package com.sda.javabyd3.wowa.exg006.ex01toex06;

import com.sda.javabyd3.wowa.exg006.ex01toex06.PizzaDough.FeelGoodFlatbread;
import com.sda.javabyd3.wowa.exg006.ex01toex06.PizzaDough.GlutenFree;
import com.sda.javabyd3.wowa.exg006.ex01toex06.PizzaDough.StuffedCrust;

import java.util.ArrayList;
import java.util.List;

public class PizzaRun {
    public static void main(String[] args) {
        List<Pizza> list = new ArrayList<>();
        list.add(new Margherita(new GlutenFree()));
        list.add(new Hawaiian(new FeelGoodFlatbread()));
        list.add(new Veggie(new StuffedCrust()));

        for (Pizza x : list) {
            x.preparePizza();
        }
    }
}

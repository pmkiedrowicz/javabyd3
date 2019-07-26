package com.sda.javabyd3.toki.exg006interface.ex01;

import com.sda.javabyd3.toki.exg006interface.ex01.interfaces.Pizza;
import com.sda.javabyd3.toki.exg006interface.ex01.pizza.Hawaiian;
import com.sda.javabyd3.toki.exg006interface.ex01.pizza.Margherita;
import com.sda.javabyd3.toki.exg006interface.ex01.pizza.Veggie;
import com.sda.javabyd3.toki.exg006interface.ex01.pizzaDough.CheesyBites;
import com.sda.javabyd3.toki.exg006interface.ex01.pizzaDough.GlutenFree;
import com.sda.javabyd3.toki.exg006interface.ex01.pizzaDough.StuffedCrust;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Pizza> listOfPizza=new ArrayList<>();
        listOfPizza.add(new Margherita(new StuffedCrust()));
        listOfPizza.add(new Hawaiian((new GlutenFree())));
        listOfPizza.add(new Veggie(new CheesyBites()));

        for (Pizza el:listOfPizza) {
            el.preparePizza();
        }
        
//
//        Margherita margherita = new Margherita(new AllAmericanThin());
//        margherita.preparePizza();
//
//        Hawaiian hawaiian = new Hawaiian(new AllAmericanThin());
//        hawaiian.preparePizza();
//
//        Veggie veggie = new Veggie(new StuffedCrust());
//        veggie.preparePizza();
    }
}

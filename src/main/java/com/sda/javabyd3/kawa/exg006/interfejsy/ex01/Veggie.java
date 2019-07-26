package com.sda.javabyd3.kawa.exg006.interfejsy.ex01;

import com.sda.javabyd3.kawa.exg006.interfejsy.ex01.doughForPizza.PizzaDough;

import java.util.ArrayList;
import java.util.List;

public class Veggie implements Pizza, Ingredients {

    private List<String> ingredientList;
    private PizzaDough pizzaDough;

    public Veggie(PizzaDough pizzaD) {
        this.pizzaDough = pizzaD;
        this.ingredientList = new ArrayList<String>(){{
            add("sos pomidorowy");
            add("ser");
            add("oliwki");
            add("bazylia");
        }};

    }

    @Override
    public void preparePizza() {
        System.out.println("Veggie:");
        System.out.println(" - Ciasto");
        pizzaDough.preparePizzaDough();
        System.out.println(" - Skladniki");
        for (String x : ingredientList){
            System.out.println("dodano " + x);
        }
        System.out.println("- Do pieca");
        System.out.println("- Pizza gotowa!");
    }

    @Override
    public List<String> getIngredients() {
        return ingredientList;
    }
}

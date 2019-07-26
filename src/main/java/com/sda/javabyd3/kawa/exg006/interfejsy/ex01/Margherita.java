package com.sda.javabyd3.kawa.exg006.interfejsy.ex01;

import com.sda.javabyd3.kawa.exg006.interfejsy.ex01.doughForPizza.PizzaDough;

import java.util.ArrayList;
import java.util.List;

public class Margherita implements Pizza, Ingredients {

    private List<String> ingredientList;
    private PizzaDough pizzaDough;

    public Margherita(PizzaDough pizzaD) {
        this.pizzaDough = pizzaD;
        this.ingredientList = new ArrayList<String>() {{
            add("sos pomidorowy");
            add("pieczarki");
            add("ser");
            add("listki swiezej bazylii");
        }};
    }

    @Override
    public void preparePizza() {
        System.out.println("Margherita:");
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

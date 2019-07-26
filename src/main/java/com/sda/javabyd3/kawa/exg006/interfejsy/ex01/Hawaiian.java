package com.sda.javabyd3.kawa.exg006.interfejsy.ex01;

import com.sda.javabyd3.kawa.exg006.interfejsy.ex01.doughForPizza.PizzaDough;

import java.util.ArrayList;
import java.util.List;

public class Hawaiian implements Pizza, Ingredients {

    public List<String> ingredientList;
    private PizzaDough pizzaDough;

    public Hawaiian(PizzaDough pizzaD) {
        this.pizzaDough = pizzaD;
        this.ingredientList = new ArrayList<String>() {{
            add("sos pomidorowy");
            add("szynka");
            add("ser");
            add("ananas");
        }};
    }

    @Override
    public void preparePizza() {
        System.out.println("Hawaiian:");
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
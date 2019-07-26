package com.sda.javabyd3.toki.exg006interface.ex01.pizza;

import com.sda.javabyd3.toki.exg006interface.ex01.interfaces.Ingredients;
import com.sda.javabyd3.toki.exg006interface.ex01.interfaces.Pizza;
import com.sda.javabyd3.toki.exg006interface.ex01.interfaces.PizzaDough;

import java.util.ArrayList;
import java.util.List;

public class Hawaiian implements Pizza, Ingredients {
    private PizzaDough pizzaDough;

    public Hawaiian(PizzaDough pizzaDough) {
        this.pizzaDough = pizzaDough;
    }

    @Override
    public List<String> getIngredients() {
        List<String> listOfIngredients = new ArrayList<>();
        listOfIngredients.add("Tomato sauce");
        listOfIngredients.add("Cheese");
        listOfIngredients.add("Ham");
        listOfIngredients.add("Pineapple");
        return listOfIngredients;
    }

    @Override
    public void preparePizza() {
        System.out.println("\nHawaiian");
        pizzaDough.preparePizzaDough();
        System.out.println("Put ingredients");
        System.out.println(getIngredients());
        System.out.println("Bake");

    }
}

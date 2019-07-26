package com.sda.javabyd3.syga.exg006.ex01_06.Pizzaa;

import com.sda.javabyd3.syga.exg006.ex01_06.Dough.PizzaDough;
import com.sda.javabyd3.syga.exg006.ex01_06.Pizzaa.Ingredients;
import com.sda.javabyd3.syga.exg006.ex01_06.Pizzaa.Pizza;

import java.util.ArrayList;
import java.util.List;

public class Veggie implements Pizza, Ingredients {
    private List<String> listOfIngredients;
    private PizzaDough pizzaDough;

    public Veggie(PizzaDough pizzaDough) {
        this.listOfIngredients = new ArrayList<>();
        this.pizzaDough = pizzaDough;
        listOfIngredients.add("Oregano");
        listOfIngredients.add("Mozzarella chesse");
        listOfIngredients.add("Garlic");
        listOfIngredients.add("Green bell pepper");
        listOfIngredients.add("Onion");
    }

    public Veggie(List<String> listOfIngredients, PizzaDough pizzaDough) {
        this.listOfIngredients = listOfIngredients;
        this.pizzaDough = pizzaDough;
    }

    @Override
    public void preparePizza() {
        System.out.println("1. ");
        pizzaDough.preparePizzaDough();
        System.out.println("2. Add a sauce");
        System.out.println("3. Add ingredients");
        System.out.println("4. Put the pizzas in the oven.");
        System.out.println("5. After 10 minutes, remove the pizza.");
        System.out.println("6. It's ready. Bon Appetit.");
    }

    @Override
    public List<String> getIngredients() {
        return listOfIngredients;
    }
}

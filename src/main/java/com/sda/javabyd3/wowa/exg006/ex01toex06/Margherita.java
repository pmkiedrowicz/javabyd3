//Przygotuj interfejs o nazwie Pizza do wypiekania pizzy posiadający jedną metodę
//void preparePizza(). Zaimplementuj w/w interfejs w klasie Margherita, Hawaiian,
//Veggie. Niech metoda preparePizza() wyświetla na konsoli kroki jakie należy
//wykonać aby przygotować pizzę. Każda pizza powinna mieć listę składników, która
//będzie przechowywana jako lista. Utwórz konstruktor bezparametrowy oraz taki,
//który umożliwia przekazanie listy składników do każdej pizzy.

package com.sda.javabyd3.wowa.exg006.ex01toex06;

import com.sda.javabyd3.wowa.exg006.ex01toex06.PizzaDough.PizzaDough;

import java.util.ArrayList;
import java.util.List;

public class Margherita implements Pizza, Ingredients {
    private List<String> ingredientsList;
    private PizzaDough pizzaDough;

    public Margherita(PizzaDough pizdough) {
        this.pizzaDough = pizdough;
        this.ingredientsList = new ArrayList<>();
        ingredientsList.add("cheese");
        ingredientsList.add("tomato sauce");
    }

    public Margherita(List<String> ingredientsList, PizzaDough pizdough) {
        this.pizzaDough = pizdough;
        this.ingredientsList = ingredientsList;
    }

    @Override
    public void preparePizza() {
        System.out.println("----- Margherita Pizza -----");
        System.out.println("Making pizza dough: ");
        pizzaDough.preparePizzaDough();
        System.out.println("Adding ingredients: ");
        for (String x : ingredientsList) {
            System.out.print(x + " ");
        }
        System.out.println("\nNow it's cooking time");
        System.out.println("Pizza is ready");
    }

    @Override
    public List<String> getIngredients() {
        return ingredientsList;
    }
}

package com.sda.javabyd3.urdu.exg006interface.exPizza.pizza;
import com.sda.javabyd3.urdu.exg006interface.exPizza.dough.PizzaDough;


import java.util.ArrayList;
import java.util.List;

public class Margherita implements Pizza , Ingredients {

    private List<String> listOfIngredients;
    private PizzaDough pizzaDough;

    public Margherita(PizzaDough dough) {
        this.listOfIngredients = new ArrayList<>();
        listOfIngredients.add("ser");
        listOfIngredients.add("pieczarki");
        listOfIngredients.add("przyprawy");
        this.pizzaDough = dough;
    }

    public Margherita(List<String> list, PizzaDough dough) {
        this.listOfIngredients = list;
        this.pizzaDough = dough;

    }

    @Override
    public void preparePizza() {
        System.out.println("Margaritta");
        pizzaDough.preparePizzaDough();
        System.out.println("Wybrane składniki to: ");
        System.out.println(listOfIngredients);
        System.out.println("Układanie składników na cieście");
        System.out.println("Pieczenie... proszę czekać..");
        System.out.println("Pizza jest gotowa. Smacznego !");
        System.out.println();
    }

    @Override
    public List<String> getIngredients() {

        return listOfIngredients;
    }
}
